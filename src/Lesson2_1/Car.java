package Lesson2_1;

public class Car {
    private int year;
    private String color;

    public Car() {
        System.out.println("Created avto");
    }

    public Car(int year) {
        this.year = year;
        System.out.println("Year: " + year);
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        System.out.println("Year: " + year + " Color: " + color);
    }
}
