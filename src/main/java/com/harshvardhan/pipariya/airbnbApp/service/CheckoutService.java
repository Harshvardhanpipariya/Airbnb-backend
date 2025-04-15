package com.harshvardhan.pipariya.airbnbApp.service;

import com.harshvardhan.pipariya.airbnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}

