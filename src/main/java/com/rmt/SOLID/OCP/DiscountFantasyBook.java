package com.rmt.SOLID.OCP;

public class DiscountFantasyBook implements BookDiscount{
    @Override
    public double discountValue(){ return 0.2; }
}
