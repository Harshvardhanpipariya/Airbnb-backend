package com.harshvardhan.pipariya.airbnbApp.service;


import com.harshvardhan.pipariya.airbnbApp.dto.ProfileUpdateRequestDto;
import com.harshvardhan.pipariya.airbnbApp.dto.UserDto;
import com.harshvardhan.pipariya.airbnbApp.entity.User;

public interface UserService {


    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
