package com.hendisantika.springsecurity5.persistence;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/18
 * Time: 07.21
 * To change this template use File | Settings | File Templates.
 */

@Component
public class DataSetupBean implements InitializingBean {

    @Autowired
    private FooRepository repo;

    //

    @Override
    public void afterPropertiesSet() {
        IntStream.range(1, 20)
                .forEach(i -> repo.save(new Foo(randomAlphabetic(8))));
    }

}
