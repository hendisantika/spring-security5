package com.hendisantika.springsecurity5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/01/18
 * Time: 06.39
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Example1IntegrationTest {
    public static void block(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    @Test
    public void test1a() {
        block(3000);
    }

    @Test
    public void test1b() {
        block(3000);
    }
}
