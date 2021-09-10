package com.example.ObjectOriented;

public class Example {
    public static void main(String[] args) {
        Song item1 = new Song();
        Song item2 = new Song();
        initSong(item1, "Hello Little Girl", "Mio Akiyama");
        initSong(item2, "Fuwa-fuwa Time", "Houkago Tea Time");
        output(item1);
        output(item2);
    }

    private static void initSong(Song obj, String name, String artist) {
        obj.setName(name);
        obj.setArtist(artist);
    }

    private static void output(Song obj) {
        print("Song Name: " + obj.getName());
        print("Artist: " + obj.getArtist());
        print("");
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
