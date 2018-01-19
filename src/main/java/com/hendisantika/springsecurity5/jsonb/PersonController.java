package com.hendisantika.springsecurity5.jsonb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/18
 * Time: 07.14
 * To change this template use File | Settings | File Templates.
 */

@RestController("/person")
public class PersonController {
    List<Person> personRepository;

    @PostConstruct
    public void init() {
        // @formatter:off
        personRepository = new ArrayList<>(Arrays.asList(
                new Person(1, "Uzumaki Naruto", "naruto@test.com", 20, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1000)),
                new Person(2, "Uchiha Sasuke", "sasuke@test.com", 20, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1500)),
                new Person(3, "Haruno Sakura", "sakura@test.com", 20, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1000)),
                new Person(4, "Hatake Kakashi", "kakashi@test.com", 21, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1500)),
                new Person(5, "Sarutobi Asuma", "sarutobi@test.com", 21, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1200)),
                new Person(6, "Minato Namikaze", "minato@test.com", 20, LocalDate.of(2019, 9, 9), BigDecimal.valueOf(1000))));
        // @formatter:on

    }

    @GetMapping("/person/{id}")
    @ResponseBody
    public Person findById(@PathVariable final int id) {
        return personRepository.get(id);
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public boolean insertPerson(@RequestBody final Person person) {
        return personRepository.add(person);
    }

    @GetMapping("/person")
    @ResponseBody
    public List<Person> findAll() {
        return personRepository;
    }
}
