package ru.netology.lesson2;
import java.util.Scanner;
class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слагаемое:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе слагаемое:");
        int value2 = scanner.nextInt();
        int sumOfTwoValues = sum(value1, value2);
        System.out.println("Результат сложения: " + sumOfTwoValues);
    }
    static int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }
}