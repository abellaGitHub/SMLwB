package com.springboot.myapp.services;

import com.springboot.myapp.models.Room;
import com.springboot.myapp.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abella on 2017-07-04.
 */
@Service
@Transactional
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Room save(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> saveAll(Iterable<Room> roomsList) {
        return roomRepository.save(roomsList);
    }

    public void delete(Long roomId) {
        roomRepository.delete(roomId);
    }

    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    public Room findOne(Long roomId) {
        return roomRepository.findOne(roomId);
    }
}
