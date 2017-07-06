package com.springboot.myapp.repositories;

import com.springboot.myapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abella on 2017-07-04.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
