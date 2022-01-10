package com.wangfei.designPattern.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();
        TravelByAir travelByAir = new TravelByAir();
        context.setTravelStrategy(travelByAir);

        context.travelMode();

        System.out.println("change travelStrategy to by car");

        TravelByCar travelByCar = new TravelByCar();
        context.setTravelStrategy(travelByCar);
        context.travelMode();
    }
}
