package me.whiteship;

import java.util.ArrayList;

public class MyProgram {
    public static void main(String[] args) {

        // Proxy Pattern : 대리인 역할을 하는 클래스, 중요한 작업은 실제 클래스를 호출해서 작업하는 방식.
        ArrayList<Thumbnail> thumbnails = new ArrayList<Thumbnail>();

        thumbnails.add(new ProxyThumbnail("Git 강좌", "/git.mp4"));
        thumbnails.add(new ProxyThumbnail("Rest API란?", "/rest-api.mp4"));
        thumbnails.add(new ProxyThumbnail("도커 사용법", "/docker.mp4"));
        thumbnails.add(new ProxyThumbnail("객체지향 프로그래밍", "/oodp.mp4"));
        thumbnails.add(new ProxyThumbnail("블록체인의 원리", "/blockchain.mp4"));

        for (Thumbnail thumbnail : thumbnails) {
            thumbnail.showTitle();
        }

        thumbnails.get(2).showPreview();
        thumbnails.get(2).showPreview();
        thumbnails.get(4).showPreview();
        thumbnails.get(1).showPreview();

    }
}
