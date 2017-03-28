package com.rb.rpi.service;

import com.rb.rpi.entity.Person;
import com.rb.rpi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rahul on 23-3-17.
 */
@Component
public class PersonService {

    @Autowired
    PersonRepository repository;

    @Autowired
    PersonValidatorService service;

    public Person save(Person person){
        if(service.validatePerson(person))
        return  repository.save(person);
        else
            throw  new IllegalArgumentException("Person Not allowed");
    }

    public Iterable<Person> findAll() {
        return repository.findAll();
    }
}
