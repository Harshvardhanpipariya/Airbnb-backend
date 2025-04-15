package com.harshvardhan.pipariya.airbnbApp.repository;

import com.harshvardhan.pipariya.airbnbApp.entity.Hotel;
import com.harshvardhan.pipariya.airbnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByOwner(User user);
}

