package com.rmt.OCP;

public class DiscountFictionBook implements BookDiscount{
    @Override
    public double discountValue(){ return 0.8; }
}
