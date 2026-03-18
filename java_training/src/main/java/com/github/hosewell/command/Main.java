package com.github.hosewell.command;

public class Main {
    public static void main(String[] args) {
        // 1. The Receiver (The actual device)
        Light livingRoomLight = new Light();

        // 2. The Command (The instruction)
        LightOnCommand switchOn = new LightOnCommand(livingRoomLight);

        // 3. The Invoker (The remote)
        RemoteControl remote = new RemoteControl();

        // 4. Link them and Press the button
        remote.setCommand(switchOn);
        remote.pressButton();
        
        // 5. Test the Undo
        remote.pressUndo();
    }
}