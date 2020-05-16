package me.whiteship;

public class MyProgram {
    public static void main(String[] args) {

        // Singleton Pattern : 공유가능한 유일한 객체
        new FirstPage().setAndPrintSettings();
        new SecondPage().printSettings();

    }
}
