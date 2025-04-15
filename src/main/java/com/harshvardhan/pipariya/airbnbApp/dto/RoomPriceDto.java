package com.harshvardhan.pipariya.airbnbApp.dto;

import com.harshvardhan.pipariya.airbnbApp.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomPriceDto {
    private Room room;
    private Double price;
}
