package com.hendisantika.springsecurity5.jsonb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/18
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.hendisantika.springsecurity5.jsonb"})
public class Spring5Application {
    public static void main(String[] args) {
        SpringApplication.run(Spring5Application.class, args);
    }

    @Bean
    public HttpMessageConverters customConverters() {
        Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        JsonbHttpMessageConverter jsonbHttpMessageConverter = new JsonbHttpMessageConverter();
        messageConverters.add(jsonbHttpMessageConverter);
        return new HttpMessageConverters(true, messageConverters);
    }
}
