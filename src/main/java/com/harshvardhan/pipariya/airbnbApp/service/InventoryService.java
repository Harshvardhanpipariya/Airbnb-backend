package com.harshvardhan.pipariya.airbnbApp.service;

import com.harshvardhan.pipariya.airbnbApp.dto.HotelDto;
import com.harshvardhan.pipariya.airbnbApp.dto.*;
import com.harshvardhan.pipariya.airbnbApp.entity.Room;
import org.springframework.data.domain.Page;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
