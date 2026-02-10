package com.github.hosewell.lambda;

@FunctionalInterface
public interface Printer {
    String print(String content, String path);
}
