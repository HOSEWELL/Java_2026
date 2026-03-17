package com.github.hosewell.command;

public interface Command {
    void execute();
    void undo(); // Command pattern makes "Undo" very easy!
}