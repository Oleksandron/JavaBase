package Lesson2_2;

public class Car {
    private int year;
    private double speed;
    private  int weight;
    private String color;

    public Car() {
        System.out.println("This car product of Ukraine");
    }

    public Car(double speed) {
        this.speed = speed;
        System.out.println("Speed: " + speed);
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        System.out.println("Year: " + year + " Color: " + color);

    }

    public Car(double speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Speed: " + speed + " Weight: " + weight + " Color: " + color);
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Year: " + year + " Speed: " + speed + " Weight: " + weight + " Color: " + color);
    }
}
