package com.hendisantika.springsecurity5.functional;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

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
public class IndexRewriteFilter implements WebFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, WebFilterChain webFilterChain) {
        ServerHttpRequest request = serverWebExchange.getRequest();
        if (request.getURI()
                .getPath()
                .equals("/")) {
            return webFilterChain.filter(serverWebExchange.mutate()
                    .request(builder -> builder.method(request.getMethod())
                            .contextPath(request.getPath()
                                    .toString())
                            .path("/test"))
                    .build());
        }
        return webFilterChain.filter(serverWebExchange);
    }
}

