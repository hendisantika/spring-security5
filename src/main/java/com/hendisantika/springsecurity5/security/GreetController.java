package com.hendisantika.springsecurity5.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.security.Principal;

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

@RestController
public class GreetController {
    private GreetService greetService;

    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/")
    public Mono<String> greet(Mono<Principal> principal) {
        return principal
                .map(Principal::getName)
                .map(name -> String.format("Hello, %s", name));
    }

    @GetMapping("/admin")
    public Mono<String> greetAdmin(Mono<Principal> principal) {
        return principal
                .map(Principal::getName)
                .map(name -> String.format("Admin access: %s", name));
    }

    @GetMapping("/greetService")
    public Mono<String> greetService() {
        return greetService.greet();
    }
}
