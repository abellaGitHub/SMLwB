package com.springboot.myapp.repositories;

import com.springboot.myapp.models.Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abella on 2017-07-04.
 */

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long> {
}
