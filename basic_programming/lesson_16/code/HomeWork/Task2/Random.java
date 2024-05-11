package code.HomeWork.Task2;

public class Random {
    public static void main(String[] args) {

        int a = 25;
        int b = 65;
        int c = 5;
        int d = 16;
        System.out.println(a + ", " + b + ", " + c + ", " + d);

        int maxNum = a;
        if (b > maxNum){
            maxNum = b;
        }
        if (c > maxNum){
            maxNum = c;
        }
        if (d > maxNum){
            maxNum = d;
        }
        System.out.println("Max number is " + maxNum);

    }
}
