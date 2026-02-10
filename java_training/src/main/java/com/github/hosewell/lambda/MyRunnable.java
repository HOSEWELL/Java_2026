package com.github.hosewell.lambda;

@FunctionalInterface
public interface MyRunnable extends Runnable {

    default void print(String content) {

    }

    static void countPages() {

    }

    private void showInfo() {

    }

}
