package Lesson2_3;

public class Car {
    private int year;
    private double speed;
    private  int weight;
    private String color;

    public Car() {
        this(2018, 190.7, 1650,"Silver");
    }

    public Car(String color) {
        this.color = color;
        System.out.println("Color: " + color);
    }

    public Car(double speed, int weight) {
        this.speed = speed;
        this.weight = weight;
        System.out.println("Speed: " + speed + " Weight: " + weight);
    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.color = color;
        System.out.println("Year: " + year + " Speed: " + speed + " Color: " +color);
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Year: " + year + " Speed: " + speed + " Weight: " + weight + " Color: " + color);
    }
}
