package com.gqz.springbootdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-06-16 21:39
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
//    @Pattern(regexp = "^\\s", message = "")
    private String name;
    private Integer age;
    private String sex;
}
