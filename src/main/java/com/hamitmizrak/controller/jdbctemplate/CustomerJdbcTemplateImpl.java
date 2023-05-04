package com.hamitmizrak.controller.jdbctemplate;

import com.hamitmizrak.business.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

// LOMBOK
@RequiredArgsConstructor //injection

// JDBC Template
public class CustomerJdbcTemplateImpl implements ICustomerJdbcTemplate {

    //injection
    private final JdbcTemplate jdbcTemplate;

    // -- CREATE SCHEMA `spring` DEFAULT CHARACTER SET utf8 ;
    // use spring;


    // SQL ==> insert into spring.customer (name,surname,email,password) values ("Hamit44","Mızrak44","hamitmizrak@gmail.com","Hm123456@");
    //SAVE
    @Override
    @Transactional // create,update,delete için kullan
    public int save(CustomerDto customerDto) {
        return jdbcTemplate.update("insert into customer (name,surname,email,password) values (?,?,?,?)"
                , customerDto.getName(), customerDto.getSurname(), customerDto.getEmail(), customerDto.getPassword());
    }


    // SQL ==> SELECT * FROM spring.customer;
    //LIST
    @Override
    public List<CustomerDto> findAll() {
        return jdbcTemplate.query(
                "SELECT * FROM spring.customer",
                (rs, rowNum) ->
                        new CustomerDto(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("surname"), //getBigDecimal
                                rs.getString("email"),
                                rs.getString("password")
                        )
        );
    }




    //UPDATE
    // SQL ==> update  spring.customer  set name="Hamit55",surname="Mızrak55" where id =1;
    @Override
    @Transactional // create,update,delete için kullan
    public int update(CustomerDto customerDto) {
        return jdbcTemplate.update(
                "update  spring.customer  set name=?,surname=? where id =?",
                customerDto.getName(), customerDto.getSurname(), customerDto.getId());
    }

    // DELETE BYID
    // SQL ==> delete FROM spring.customer where id="10";
    @Override
    @Transactional // create,update,delete için kullan
    public int deleteById(Long id) {
        return jdbcTemplate.update(
                "delete FROM spring.customer where id = ?",
                id);
    }

    // COUNT
    // SQL ==> select count(*) from customer;
    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from customer", Integer.class);
    }


    // FIND ID
    // SQL ==> select * from spring.customer where id =9;
    @Override
    public Optional<CustomerDto> findById(Long id) {
        return jdbcTemplate.queryForObject(
                "select * from spring.customer where id = ?",
                new Object[]{id},
                // lambda expression
                (rs, rowNum) ->
                        Optional.of(new CustomerDto(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("surname"), //getBigDecimal
                                rs.getString("email"),
                                rs.getString("password")
                        ))
        );
    }

    // FIND GetName
    // SQL => select name from spring.customer where id = 1;
    @Override
    public String getNameById(Long id) {
        return jdbcTemplate.queryForObject(
                "select name from books where id = ?",
                new Object[]{id},
                String.class
        );
    }

    // LIKE
    /*
    SQL
    -- find sadece name
    select name from spring.customer where id = 1;

    -- like
    -- name kolonunda p ile başlayan değerleri bul
    select * from spring.customer where name like 'h%';

    -- name kolonunda p ile biten değerleri bul
    select * from spring.customer where name like '%t';

    -- name kolonunda ikinci harfi a olan
    select * from spring.customer where name like '_a%';

    -- name kolonunda hmt geçenolan
    select * from spring.customer where name like '[hmt]%';

    -- name ve surname
    select * from spring.customer where name like 'h%' or surname like 'm%'
     */
    @Override
    public List<CustomerDto> findByNameAndSurname(String name, String surname) {
        return jdbcTemplate.query(
                "select * from spring.customer where name like 'h%' or surname like 'm%'",
                new Object[]{"%" + name + "%", surname},
                (rs, rowNum) ->
                        new CustomerDto(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("surname")
                        )
        );
    }

}// end class
