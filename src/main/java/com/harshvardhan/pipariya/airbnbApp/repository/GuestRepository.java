package com.harshvardhan.pipariya.airbnbApp.repository;

import com.harshvardhan.pipariya.airbnbApp.entity.Guest;
import com.harshvardhan.pipariya.airbnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}