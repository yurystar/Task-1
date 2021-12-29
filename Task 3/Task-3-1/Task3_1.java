package com.senla.task3;

public class Task3_1 {

    public static void main(String[] args) {
        Task3_1Service inst = new Task3_1Service();

        int a = inst.getRandomNumber(999);
        int b = inst.getRandomNumber(999);
        int c = inst.getRandomNumber(999);

        System.out.println("Задача 1");
        inst.showMaxDigitOfNum(a);

        System.out.println("Задача 2");
        inst.showSumOfFirstDigits(a, b, c);

        System.out.println("Задача 3");
        inst.showDiff(a, b, c);

        System.out.println("Задача 4");
        inst.showSumOfDigitsInNum(a);
    }
}
