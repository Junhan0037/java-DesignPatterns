package me.whiteship;

public class MyProgram {
    public static void main(String[] args) {

        // State Pattern : 메소드가 실행될 때, 모드도 전환되도록 하는 것
        final ModeSwitch modeSwitch = new ModeSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();

    }
}
