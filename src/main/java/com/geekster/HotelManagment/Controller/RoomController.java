package com.geekster.HotelManagment.Controller;

import com.geekster.HotelManagment.Service.RoomService;
import com.geekster.HotelManagment.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;


    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom){
        return roomService.addRoom(newRoom);

    }
    //get api

    @GetMapping("rooms")
    public List<Room> getRooms(){
        return roomService.getRooms();
    }

    //add multiple rooms at ones
   @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> newRoom){
        return roomService.addRooms(newRoom);
    }

    //getRoomById



    @GetMapping("room/id/{id}")
    public Room getroomById(@PathVariable Integer id){
        return roomService.getRoomById(id);

    }

    //delet
    @DeleteMapping("rooms/ids")
    public String deleteByIds(@RequestBody List<Integer> ids){
        return roomService.deleteByIds(ids);

    }
}
