package com.harshvardhan.pipariya.airbnbApp.repository;

import com.harshvardhan.pipariya.airbnbApp.entity.Booking;
import com.harshvardhan.pipariya.airbnbApp.entity.Hotel;
import com.harshvardhan.pipariya.airbnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByPaymentSessionId(String sessionId);

    List<Booking> findByHotel(Hotel hotel);

    List<Booking> findByHotelAndCreatedAtBetween(Hotel hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<Booking> findByUser(User user);
}
