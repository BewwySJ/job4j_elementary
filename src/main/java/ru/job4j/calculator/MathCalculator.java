package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifSegmentation(double first, double second) {
        return difference(first, second)
                + segmentation(first, second);
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                  + difference(first, second)
                    + segmentation(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifSegmentation(30, 40));
        System.out.println("Результат расчета равен: " + sumAllOperation(50, 60));
    }
}
