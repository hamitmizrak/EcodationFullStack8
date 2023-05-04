package com.hamitmizrak.bean;

import com.hamitmizrak.business.dto.CustomerDto;
import com.hamitmizrak.controller.jdbctemplate.ICustomerJdbcTemplate;
import lombok.extern.log4j.Log4j2;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Log4j2

@Configuration
public class JdbcTemplateBean implements CommandLineRunner {

    //private static final Logger log = (Logger) LoggerFactory.getLogger(JdbcTemplateBean.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    //@Qualifier("jdbcBookRepository")              // Test JdbcTemplate
    //@Qualifier("namedParameterJdbcBookRepository")  // Test NamedParameterJdbcTemplate
    private ICustomerJdbcTemplate bookRepository;


    @Override
    public void run(String... args) {
        log.info("StartApplication... 555555");
        runJDBC();
    }

    void runJDBC() {

        //log.info("Creating tables for testing...");

        /*jdbcTemplate.execute("DROP TABLE customer IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customer(" +
                "id SERIAL, name VARCHAR(255), surname VARCHAR(255))");

        List<CustomerDto> books = Arrays.asList(
                new CustomerDto("name1","surname1"),
                new CustomerDto("name2","surname2"),
                new CustomerDto("name3","surname3")
        );*/

       /* log.info("[SAVE]");
        books.forEach(book -> {
            //log.info("Saving...{}", book.getName());
            System.out.println("NAME44:"+ book.getName());
            bookRepository.save(book);
        });
*/
        // count
        //log.info("[COUNT] Total books: {}", bookRepository.count());

        // find all
        //log.info("[FIND_ALL] {}", bookRepository.findAll());

        // find by id
        //log.info("[FIND_BY_ID] :2L");
        //CustomerDto book = bookRepository.findById(2L).orElseThrow(IllegalArgumentException::new);
        //log.info("{}", book);

        // find by name (like) and price
        log.info("[FIND_BY_NAME_AND_PRICE] : like '%Java%' and price <= 10");
        //log.info("{}", bookRepository.findByNameAndPrice("Java", new BigDecimal(10)));

        // get name (string) by id
        //log.info("[GET_NAME_BY_ID] :1L = {}", bookRepository.getNameById(1L));

        // update
        //log.info("[UPDATE] :2L :99.99");
        //book.setSurname("surname"));
        //log.info("rows affected: {}", bookRepository.update(book));

        // delete
        //log.info("[DELETE] :3L");
        //log.info("rows affected: {}", bookRepository.deleteById(3L));

        // find all
        //log.info("[FIND_ALL] {}", bookRepository.findAll());

        // find by id
        //log.info("[FIND_BY_ID] :2L");
        //Book book = bookRepository.findById(2L).orElseThrow(IllegalArgumentException::new);
        //log.info("{}", book);

        // find by name (like) and price
        //log.info("[FIND_BY_NAME_AND_PRICE] : like '%Java%' and price <= 10");
        //log.info("{}", bookRepository.findByNameAndPrice("Java", new BigDecimal(10)));

        // get name (string) by id
        //log.info("[GET_NAME_BY_ID] :1L = {}", bookRepository.getNameById(1L));

        // update
        //log.info("[UPDATE] :2L :99.99");
        //book.setPrice(new BigDecimal("99.99"));
       // log.info("rows affected: {}", bookRepository.update(book));

        // delete
        //log.info("[DELETE] :3L");
        //log.info("rows affected: {}", bookRepository.deleteById(3L));

        // find all
        //log.info("[FIND_ALL] {}", bookRepository.findAll());

    } //end runJDBC
}
