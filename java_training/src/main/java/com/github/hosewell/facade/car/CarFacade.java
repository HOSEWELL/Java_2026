package com.github.hosewell.facade.car;

public class CarFacade {
    private FuelPump fuelPump = new FuelPump();
    private IgnitionSystem ignition = new IgnitionSystem();
    private StarterMotor starter = new StarterMotor();
    private DashboardDisplay dashboard = new DashboardDisplay();

    public void startCar() {
        dashboard.showWelcome();
        fuelPump.pump();
        starter.spin();
        ignition.spark();
        System.out.println("Engine is running!");
    }
}