package com.harshvardhan.pipariya.airbnbApp.strategy;

import com.harshvardhan.pipariya.airbnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
