package com.hendisantika.springsecurity5.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

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
public interface FooRepository extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {
}
