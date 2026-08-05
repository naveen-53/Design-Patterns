package com.example.design.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {

        subscribers.add(subscriber);

    }

    public void uploadVideo(String video) {

        System.out.println("Uploaded: " + video);

        notifySubscribers(video);

    }

    private void notifySubscribers(String video) {

        for (Subscriber subscriber : subscribers) {

            subscriber.update(video);

        }

    }

}