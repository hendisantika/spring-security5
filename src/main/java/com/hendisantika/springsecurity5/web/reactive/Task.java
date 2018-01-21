package com.hendisantika.springsecurity5.web.reactive;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/01/18
 * Time: 06.28
 * To change this template use File | Settings | File Templates.
 */
public class Task {
    private final String name;

    private final int id;

    public Task(@JsonProperty("name") String name, @JsonProperty("id") int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Task{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}
