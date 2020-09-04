package com.courtney;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        String name = "Courtney";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        //this is a comment

        while (x > 12) {
            x = x - 1;
        }

        for (x = 0; x < 10; x = x + 1) {
            System.out.println("x is now " + x);
        }

        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isnt 10");
        }
        if ((x < 3) & (name.equals("Courtney"))) {
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what");

    }
}
