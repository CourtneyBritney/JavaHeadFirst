package com.courtney;

public class Main {

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Battleship";
        one.genre = "Action";
        one.rating = 4;

        Movie two = new Movie();
        two.title = "Madea's Happy Family";
        two.genre = "Comedy";
        two.rating = 3;
        two.playIt();

        Movie three = new Movie();
        three.title = "The sun is also a Star";
        three.genre = "Romance";
        three.rating = 5;
    }
}
