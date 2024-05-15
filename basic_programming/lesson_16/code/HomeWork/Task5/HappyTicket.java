package code.HomeWork.Task5;

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
    String input = scanner.nextLine();

    // Проверяем, является ли ввод корректным четырехзначным числом
        if (input.length() != 4) {
        System.out.println("Ошибка! Введите четырехзначное число.");
        return;
    }

    // Преобразуем ввод в число и вычисляем суммы цифр
    int value = Integer.parseInt(input);
    int sumFirst = Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1));
    int sumLast = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(3));

    // Проверяем, является ли число "счастливым"
        if (sumFirst == sumLast) {
        System.out.println("Число является счастливым билетом.");
    } else {
        System.out.println("Число не является счастливым билетом.");
    }
    }
}


