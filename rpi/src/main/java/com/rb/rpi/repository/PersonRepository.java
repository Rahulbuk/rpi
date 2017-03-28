package com.rb.rpi.repository;

import com.rb.rpi.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rahul on 23-3-17.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}
