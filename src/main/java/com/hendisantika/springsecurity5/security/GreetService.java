package com.hendisantika.springsecurity5.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/18
 * Time: 07.19
 * To change this template use File | Settings | File Templates.
 */

@Service
public class GreetService {
    @PreAuthorize("hasRole('ADMIN')")
    public Mono<String> greet() {
        return Mono.just("Hello from service!");
    }
}
