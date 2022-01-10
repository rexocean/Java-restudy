package com.wangfei.designPattern.strategy;

public class TravelByAir implements TravelStrategy{

    @Override
    public void travelMode() {
        System.out.println("travel by air");
    }
}
