package Lesson8;

import java.util.Scanner;

public class Calculator {
    public static int add (int a, int b) {
        return  a + b;
    }
    public static int sub (int a, int b) {
        return  a - b;
    }
    public static int mul (int a, int b) {
        return  a * b;
    }
    public static int div (int a, int b) {
        try {
            return  a / b;
        }
        catch (Exception e){
            System.out.println("Division by zero!");
            System.out.println(e.getMessage());
        }return  a / b;
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
                System.out.println(add(a,b));
                break;
            case  "-":
                System.out.println(sub(a,b));
                break;
            case  "*":
                System.out.println(mul(a,b));
                break;
            case  "/":
                System.out.println(div(a,b));
                break;
            default:
                System.out.println("Error operation!");
        }
    }
}
