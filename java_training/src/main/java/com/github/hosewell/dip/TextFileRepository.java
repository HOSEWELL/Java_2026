package com.github.hosewell.dip;

public class TextFileRepository implements DataRepository {
    @Override
    public void save(String studentName) {
        System.out.println("Saving '" + studentName + "' to a text file...");
    }
    
}
