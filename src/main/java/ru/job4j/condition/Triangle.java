package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        Triangle.exist(10, 10, 10);
        Triangle.exist(5,3,12);
        Triangle.exist(4,4, 7);
    }
}
