package com.example.throwupthursday.config;

import com.example.throwupthursday.daos.Person;
import com.example.throwupthursday.daos.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class PersonLoader implements ApplicationRunner {
    private PersonDAO person;

    @Autowired
    public PersonLoader(PersonDAO person) {
        this.person = person;
    }



    public void run(ApplicationArguments args) {

        Person[] users = new Person[]{
                new Person("wilhem", 45),
                new Person("kris", 45),
                new Person("froilan", 45),
                new Person("nhu", 45),
                new Person("leon", 45),
                new Person("Bilbo", 45),
        };

        for (Person person : users)
            this.person.save(person);

    }
}
