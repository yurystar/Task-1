package com.senla.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3_1 {
    public static int getRandomNumber(int a) {
        int d = new Random().nextInt(a);
        System.out.println("Сгенерированное число - " + d);
        return d;
    }
    public static void showMaxDigitOfNum (int a) {
        System.out.println("Число - " + a);
        List<Integer> listOfDigits = new ArrayList<>();
        for (; a > 0 ; a /=10) {
            listOfDigits.add(a % 10);
        }
        Integer s = listOfDigits.stream().max(Integer::compareTo).get();
        System.out.println("Максимальная цифра в этом числе - " + s);
    }
    public static void showSumOfFirstDigits (int a, int b, int c) {
        System.out.println("Первое число - " + a);
        System.out.println("Второе число - " + b);
        System.out.println("Третье число - " + c);
        System.out.println("Сумма первых цифр чисел равна - " + (a/100+b/100+c/100));
    }
    public static void showDiff (int a, int b, int c) {
        System.out.println("Первое число - " + a);
        System.out.println("Второе число - " + b);
        System.out.println("Третье число - " + c);
        System.out.println("Разница между слиянием 1, 2 числа и 3 числом равна - " + (a*1000+b-c));
    }
    public static void showSumOfDigitsInNum (int a) {
        System.out.println("Число - " + a);
        List <Integer> listOfDigits = new ArrayList<>();
        for (; a > 0 ; a /=10) {
            listOfDigits.add(a % 10);
        }
        Integer s = listOfDigits.stream().reduce(0,(d, f) -> d+f);
        System.out.println("Сумма цифр из которых состоит число - " + s);
    }
    public static void main(String[] args) {
        int a = Task3_1.getRandomNumber(999);
        int b = Task3_1.getRandomNumber(999);
        int c = Task3_1.getRandomNumber(999);
        System.out.println("Задача 1");
        Task3_1.showMaxDigitOfNum(a);
        System.out.println("Задача 2");
        Task3_1.showSumOfFirstDigits(a, b, c);
        System.out.println("Задача 3");
        Task3_1.showDiff(a, b, c);
        System.out.println("Задача 4");
        Task3_1.showSumOfDigitsInNum(a);
    }
}
