package me.whiteship;

public interface FindAlgorithm {
    public void find (boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm {
    @Override
    public void find(boolean global) {
        System.out.println("find movid" + (global ? " globally" : ""));
        // 동영상검색하는 코드
        // ..
        // ..
    }
}
