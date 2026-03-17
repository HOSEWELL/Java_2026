package com.github.hosewell.decorator;

public class BasicStudent implements Student {
    
    @Override
    public String getDescription() { 
        return "Basic Student"; 
    }

    @Override
    public double getFees() { 
        return 10000.0; 
    }
}
