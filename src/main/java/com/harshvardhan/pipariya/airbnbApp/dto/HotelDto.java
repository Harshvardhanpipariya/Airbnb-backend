package com.harshvardhan.pipariya.airbnbApp.dto;

import com.harshvardhan.pipariya.airbnbApp.entity.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDto {
    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;
}
