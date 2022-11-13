package Lesson3_2;

public class Car extends  Vehicle{
    String color;

    public Car(int price, int speed, int year, byte[] coordinates, String color){
        super.Vehicle(price, speed, year, coordinates);
        this.color = color;
    }
    public void PrintCar(){
        System.out.print("Color: " + color + super.Print());
    }
}
