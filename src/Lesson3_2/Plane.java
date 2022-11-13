package Lesson3_2;

public class Plane extends  Vehicle{
    int height,pass;

    public Plane(int price, int speed, int year, byte[] coordinates, int height, int pass){
        super.Vehicle(price, speed, year, coordinates);
        this.height = height;
        this.pass = pass;
    }
    public void PrintPlane(){
        System.out.println("Height: " + height + ", pass: " + pass + "," + super.Print());
    }
}
