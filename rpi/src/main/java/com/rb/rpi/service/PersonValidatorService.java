package com.rb.rpi.service;

import com.rb.rpi.entity.Person;
import org.springframework.stereotype.Service;

/**
 * Created by rahul on 28-3-17.
 */
@Service
public class PersonValidatorService {

    public boolean validatePerson(Person person){
        if(person.getAge() > 20){
            return true;
        } else{
            return  false;
        }
    }

}
