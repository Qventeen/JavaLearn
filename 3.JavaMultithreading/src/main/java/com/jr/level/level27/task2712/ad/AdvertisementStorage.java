package com.jr.level.level27.task2712.ad;


import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище рекламных роликов
 * Поскольку хранилищем является единственным на весь ресторан
 * Оно является Singleton
 */
public class AdvertisementStorage {
    private final List<Advertisement> videos = new ArrayList<>();

    //Сектор Синглтона
    private static AdvertisementStorage instance = new AdvertisementStorage();

    private AdvertisementStorage() {
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second video", 100, 10, 15 * 60)); //15 min
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60));   //10 min
        videos.add(new Advertisement(someContent, "четвертое видео", 400, 2, 10 * 60));   //10 min

    }

    public static AdvertisementStorage getInstance(){
        return instance;
    }

    public List<Advertisement> list(){
        return videos;
    }

    public void add(Advertisement advertisement){
        videos.add(advertisement);
    }

}
