package com.geekster.HotelManagment.repo;

import com.geekster.HotelManagment.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<Room,Integer> {
}
