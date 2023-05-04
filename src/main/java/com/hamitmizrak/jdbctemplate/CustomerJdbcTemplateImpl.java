package com.hamitmizrak.jdbctemplate;

import com.hamitmizrak.business.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

// LOMBOK
@RequiredArgsConstructor //injection

// JDBC Template
@Repository
public class CustomerJdbcTemplateImpl implements ICustomerJdbcTemplate {

    // INJECTION
    // Classic template
    private final JdbcTemplate jdbcTemplate; // klasik SQL için
    // NamedParameterJdbcTemplate, klasik yer tutucu yerine adlandırılmış parametreler için destek ekler
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
    // LIST
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


    // UPDATE Classic jdbcTemplate
    // SQL ==> update  spring.customer  set name="Hamit55",surname="Mızrak55" where id =1;
    /*
    @Override
    @Transactional // create,update,delete için kullan
    public int update(CustomerDto customerDto) {
        return jdbcTemplate.update(
                "update  spring.customer  set name=?,surname=? where id =?",
                customerDto.getName(), customerDto.getSurname(), customerDto.getId());
    }
    */

    // UPDATE Parameter namedParameterJdbcTemplate
    @Override
    @Transactional // create,update,delete için kullan
    public int update(CustomerDto customerDto) {
        return namedParameterJdbcTemplate.update(
                "update  spring.customer  set name=:name,surname=:surname where id =:id",
                new BeanPropertySqlParameterSource(customerDto));
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


    // FIND ID  Classic jdbcTemplate
    // SQL ==> select * from spring.customer where id =9;
    /*
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
    */

    // FIND ID  Parameter namedParameterJdbcTemplate
    @Override
    public Optional<CustomerDto> findById(Long id) {
        return namedParameterJdbcTemplate.queryForObject(
                "select * from spring.customer where id = :id",
                new MapSqlParameterSource("id", id),
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

    // LIKE =>  Classic jdbcTemplate
    /*
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
     */

    // LIKE =>  Parameter namedParameterJdbcTemplate
    @Override
    public List<CustomerDto> findByNameAndSurname(String name, String surname) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("name", "%" + name + "%");
        mapSqlParameterSource.addValue("surname", surname);

        return namedParameterJdbcTemplate.query(
                "select * from spring.customer where name like:name or surname like:surname",
                mapSqlParameterSource,
                (rs, rowNum) ->
                        new CustomerDto(
                                rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("surname")
                        )
        );
    }

}// end class
