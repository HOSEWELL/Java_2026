package com.github.hosewell.command;

public class RemoteControl {
    private Command slot;

    public void setCommand(Command command) { this.slot = command; }

    public void pressButton() { slot.execute(); }
    
    public void pressUndo() { slot.undo(); }
}