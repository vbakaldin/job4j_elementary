package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир");

        char c = 45000;
        System.out.println(c);
        float i = c;
        c = (char) i;
        System.out.println(c);

    }
}