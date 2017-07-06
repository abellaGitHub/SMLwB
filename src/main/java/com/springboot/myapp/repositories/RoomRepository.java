package com.springboot.myapp.repositories;

import com.springboot.myapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abella on 2017-07-04.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
