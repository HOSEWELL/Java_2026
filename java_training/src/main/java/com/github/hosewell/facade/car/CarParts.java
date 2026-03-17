package com.github.hosewell.facade.car;

class FuelPump {
    public void pump() { 
        System.out.println("Fuel Pump: Sending fuel to engine..."); 
    }
}

class IgnitionSystem {
    public void spark() { 
        System.out.println("Ignition: Creating spark..."); 
    }
}

class StarterMotor {
    public void spin() { 
        System.out.println("Starter: Cranking the engine..."); 
    }
}

class DashboardDisplay {
    public void showWelcome() { 
        System.out.println("Dashboard: System Check OK. Welcome, Driver."); 
    }
}