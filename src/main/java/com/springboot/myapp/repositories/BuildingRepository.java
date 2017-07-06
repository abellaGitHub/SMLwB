package com.springboot.myapp.repositories;

import com.springboot.myapp.models.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abella on 2017-07-04.
 */
@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
}
