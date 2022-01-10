package com.wangfei.designPattern.strategy;

public class TravelByCar implements TravelStrategy{

    @Override
    public void travelMode() {
        System.out.println("travel by car");
    }
}
