package com.harshvardhan.pipariya.airbnbApp.service;

import com.harshvardhan.pipariya.airbnbApp.dto.BookingDto;
import com.harshvardhan.pipariya.airbnbApp.dto.BookingRequest;
import com.harshvardhan.pipariya.airbnbApp.dto.HotelReportDto;
import com.harshvardhan.pipariya.airbnbApp.entity.enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}

