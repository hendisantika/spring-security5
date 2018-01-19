package com.hendisantika.springsecurity5.functional;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/01/18
 * Time: 05.03
 * To change this template use File | Settings | File Templates.
 */
public class MyService {
    public int getRandomNumber() {
        return (new Random().nextInt(10));
    }
}
