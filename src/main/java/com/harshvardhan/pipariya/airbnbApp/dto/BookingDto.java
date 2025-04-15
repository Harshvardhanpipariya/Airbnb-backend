package com.harshvardhan.pipariya.airbnbApp.dto;

import com.harshvardhan.pipariya.airbnbApp.entity.enums.BookingStatus;
import com.harshvardhan.pipariya.airbnbApp.entity.enums.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
    private BigDecimal amount;
}
