package com.github.hosewell.lambda;

public interface  Export {
    void export (String content);
    
    default void print(String content){

    }
}
