package com.springboot.myapp.services;

import com.springboot.myapp.models.Person;
import com.springboot.myapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> saveAll(Iterable<Person> peopleList) {
        return personRepository.save(peopleList);
    }

    public void delete(Long personId) {
        personRepository.delete(personId);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findOne(Long personId) {
        return personRepository.findOne(personId);
    }
}
