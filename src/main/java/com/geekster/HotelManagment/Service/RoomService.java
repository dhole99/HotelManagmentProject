package com.geekster.HotelManagment.Service;

import com.geekster.HotelManagment.model.Room;
import com.geekster.HotelManagment.repo.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
     @Autowired
    IRoomRepo roomRepo;
    public String addRoom(Room newRoom) {
        roomRepo.save(newRoom);
        return "RoomAdded";
    }

    public List<Room> getRooms() {
        return (List<Room>) roomRepo.findAll();
    }

    public String addRooms(List<Room> newRoom) {

        roomRepo.saveAll(newRoom);
        return newRoom.size() + "room were added";
    }


    public Room getRoomById(Integer id) {
        return roomRepo.findById(id).get();

    }

    public String deleteByIds(List<Integer> ids) {
        roomRepo.deleteAllById(ids);
        return "Delete ids";
    }
}
