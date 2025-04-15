package com.harshvardhan.pipariya.airbnbApp.strategy;

import com.harshvardhan.pipariya.airbnbApp.entity.Inventory;

import java.math.BigDecimal;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
