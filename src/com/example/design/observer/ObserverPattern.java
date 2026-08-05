package com.example.design.observer;

public class ObserverPattern {
	
	public static void main(String args[]) {
		
		YoutubeChannel channel = new YoutubeChannel();

        Subscriber alex = new User("Alex");
        Subscriber john = new User("John");
        Subscriber sara = new User("Sara");

        channel.subscribe(alex);
        channel.subscribe(john);
        channel.subscribe(sara);

        channel.uploadVideo("Observer Pattern Explained");
	}

}
