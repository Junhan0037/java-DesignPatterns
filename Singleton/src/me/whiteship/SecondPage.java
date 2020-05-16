package me.whiteship;

public class SecondPage {

    private Settings settings = Settings.getSettings();

    public void printSettings() {
        System.out.println(settings.isDarkMode() + " " + settings.getFontSize());
    }

}
