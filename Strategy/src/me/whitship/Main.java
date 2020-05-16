package me.whitship;

public class Main {
    public static void main(String[] args) {

        // Strategy Pattern : 옵션들마다의 행동들을 모듈화해서 독립적이고 상호 교체 가능하게 만드는 것
        MyProgram myProgram = new MyProgram();
        myProgram.testProgram();

    }
}
