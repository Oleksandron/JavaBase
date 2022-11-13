package Lesson6;

import java.util.Scanner;

public class Calculator {
    public static int plus (int a, int b) {
        return  a + b;
    }
    public static int minus (int a, int b) {
        return  a - b;
    }
    public static int mult (int a, int b) {
        return  a * b;
    }
    public static int div (int a, int b) {
        return  a / b;
    }
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter first digit: ");
        int a = in1.nextInt();
        System.out.println("Enter second digit: ");
        int b = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.println("Enter operation: + , - , * , / ");
        String opr = in3.nextLine();
        switch (opr){
            case "+":
                System.out.println(plus(a,b));
                break;
            case  "-":
                System.out.println(minus(a,b));
                break;
            case  "*":
                System.out.println(mult(a,b));
                break;
            case  "/":
                System.out.println(div(a,b));
                break;
            default:
                System.out.println("Error operation!");
        }
    }
}
