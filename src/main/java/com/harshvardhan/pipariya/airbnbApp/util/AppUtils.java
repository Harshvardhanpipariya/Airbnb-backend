package com.harshvardhan.pipariya.airbnbApp.util;

import com.harshvardhan.pipariya.airbnbApp.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
