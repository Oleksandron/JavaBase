package Lesson1_2;

import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = in.nextInt();
        System.out.println("Enter side2: ");
        double side2 = in.nextInt();
        Rectangle rect = new Rectangle();
        System.out.println(rect.areaCalculator(side1,side2));
        System.out.println(rect.perimetrCalculator(side1,side2));
    }
}
