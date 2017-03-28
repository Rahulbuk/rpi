package com.rb.rpi.Controller;

import com.rb.rpi.entity.Person;
import com.rb.rpi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rahul on 23-3-17.
 */
@RestController("/person")

public class PersonController {

    @Autowired
    PersonService service;

    @RequestMapping(path = "findAll", method = RequestMethod.GET)
    Iterable<Person> findAllPerson(){
        return service.findAll();
    }

    @RequestMapping(path = "save", method = RequestMethod.POST)
    Person savePerson(@RequestBody Person person){
        return service.save(person);
    }
}
