package com.hendisantika.springsecurity5.jupiter;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/01/18
 * Time: 05.39
 * To change this template use File | Settings | File Templates.
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public class SpringJUnit5Config {
    default {
    }

    default {
    }

    default {
    }

    default {
    }

    @AliasFor(annotation = ContextConfiguration.class, attribute = "classes")
    Class<?>[] value()

    @AliasFor(annotation = ContextConfiguration.class)
    Class<?>[] classes()

    @AliasFor(annotation = ContextConfiguration.class)
    String[] locations()

    @AliasFor(annotation = ContextConfiguration.class)
    Class<? extends ApplicationContextInitializer<? extends ConfigurableApplicationContext>>[] initializers()

    @AliasFor(annotation = ContextConfiguration.class)
    boolean inheritLocations()

    default true

    @AliasFor(annotation = ContextConfiguration.class)
    boolean inheritInitializers()

    default true

    @AliasFor(annotation = ContextConfiguration.class)
    String name()

    default ""
}
