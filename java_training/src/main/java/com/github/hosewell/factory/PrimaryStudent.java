package com.github.hosewell.factory;

public class PrimaryStudent implements Student {
    @Override
    public void attendClass() {
        System.out.println("Primary Student: Learning basic literacy and numeracy.");
    }
}