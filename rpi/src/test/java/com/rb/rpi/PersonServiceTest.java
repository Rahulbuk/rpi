package com.rb.rpi;

import com.rb.rpi.entity.Person;
import com.rb.rpi.service.PersonService;
import com.rb.rpi.service.PersonValidatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

/**
 * Created by rahul on 28-3-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @MockBean
    PersonValidatorService service;

    @Autowired
    PersonService personService;

    @Test
    public void testPersonValidationSerive(){
        Person person = new Person();
        person.setAge(10);
        given(this.service.validatePerson(person)).willReturn(false);
        assertThat(service.validatePerson(person)).isFalse();
        person.setAge(21);
        given(this.service.validatePerson(person)).willReturn(true);
        assertThat(service.validatePerson(person)).isTrue();
    }


    @Test
    public void testPersonServiceSave(){
        Person person = new Person();
        person.setAge(10);
        person.setName("Rahul");
        person.setLastName("B");
        given(this.service.validatePerson(person)).willReturn(true);
        Person retPerson =personService.save(person);
        assertThat(retPerson.getId()).isNotNull();
    }
}
