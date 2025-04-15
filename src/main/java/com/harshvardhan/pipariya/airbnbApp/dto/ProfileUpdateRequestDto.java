package com.harshvardhan.pipariya.airbnbApp.dto;

import com.harshvardhan.pipariya.airbnbApp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
