package com.harshvardhan.pipariya.airbnbApp.repository;

import com.harshvardhan.pipariya.airbnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoomRepository extends JpaRepository<Room, Long> {
}
