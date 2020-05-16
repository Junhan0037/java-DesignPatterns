package me.whiteship;

public interface ModeState {
    public void toggle (ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("FROM LIGHT TO DARK");
        // 화면을 어둡게 하는 코드
        // ..
        // ..
        modeSwitch.setModeState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("FROM DARK TO LIGHT");
        // 화면을 밝게 하는 코드
        // ..
        // ..
        modeSwitch.setModeState(new ModeStateLight());
    }
}
