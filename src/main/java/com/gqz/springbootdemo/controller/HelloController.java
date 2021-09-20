package com.gqz.springbootdemo.controller;

import com.gqz.springbootdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-06-15 13:23
 **/
@RestController
public class HelloController {
    @Autowired
    private Person person;
    @GetMapping("user")
    public Person user(){
        return person;
    }
}
