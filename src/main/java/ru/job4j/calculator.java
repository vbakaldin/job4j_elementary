package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumAndDifferenceSeparation(double first, double second) {
        return sum(difference(first, second), separation(first, second));
    }

    public static double sumAllOperation(double first, double second) {
        return  sum(sum(sum(first, second), multiply(first, second)),
                    sum(difference(first, second), separation(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAllOperation(10, 20));
    }
}