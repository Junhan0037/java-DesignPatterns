package me.whiteship;

public class MyProgram {
    public static void main(String[] args) {

        // Command Pattern : 여러 명령들을 목옥으로 실어보내서 차례로 실행시킬 수 있다.
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickupCommand());

        robotKit.start();

    }
}
