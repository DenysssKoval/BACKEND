package code.HomeWork.Task1;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number 1, 2 or 3" );
        Scanner scanner = new Scanner(System.in);
        int isEnter = scanner.nextInt();

        /*int answer = 2;
        if (isEnter == answer){
            System.out.println("You entered 2");}
        if (isEnter < answer){
                System.out.println("You entered 1");
        }
        else {
            System.out.println("You entered 3");
        }*/

        switch (isEnter) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }


    }
}
