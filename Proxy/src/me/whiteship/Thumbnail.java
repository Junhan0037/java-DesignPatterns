package me.whiteship;

interface Thumbnail {
    public void showTitle();
    public void showPreview();
}

class RealThumbnail implements Thumbnail { // 실제 클래스
    private String title;
    private String movieUrl;

    public RealThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;

        // URL로부터 영상을 다운받는 작업 - 시간 소모
        System.out.println(movieUrl + "로부터" + title + "의 영상 데이터 다운");
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + "의 프리뷰 재생");
    }

}

class ProxyThumbnail implements Thumbnail { // 대리인 클래스
    private String title;
    private String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, movieUrl); // RealThumbnail class 호출
        }
        realThumbnail.showPreview();
    }

}