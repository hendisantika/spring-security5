package com.hendisantika.springsecurity5.functional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/01/18
 * Time: 04.59
 * To change this template use File | Settings | File Templates.
 */
public class Actor {
    private String firstname;
    private String lastname;

    public Actor() {
    }

    public Actor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
