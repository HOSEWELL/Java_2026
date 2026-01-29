package com.github.hosewell.interfaces;


public class PhoneCharger implements ThreePinPlug{
    @Override
    public void accessPower() {
        System.out.println("Access Power called: Phone");
    }

    @Override
    public void printUsage() {

    }
}
