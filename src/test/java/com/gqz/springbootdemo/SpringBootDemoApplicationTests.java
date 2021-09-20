package com.gqz.springbootdemo;

import com.gqz.springbootdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class SpringBootDemoApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {

    }

    @Test
    void application() {
        System.out.println(person);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(formatter);

        System.out.println(format);
    }
}
