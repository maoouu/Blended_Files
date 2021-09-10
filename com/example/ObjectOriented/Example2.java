package com.example.ObjectOriented;

public class Example2 {
    public static void main(String[] args) {
        Song2 obj1 = new Song2("Fuwa-fuwa Time", "Houkago Tea Time");
        Song2 obj2 = new Song2("R.M.T.T", "Yona Yona Weekenders");
        display(obj1);
        display(obj2);
    }

    private static void display(Song2 obj) {
        print("Song Name: " + obj.name);
        print("Artist: " + obj.artist);
        print("");
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
