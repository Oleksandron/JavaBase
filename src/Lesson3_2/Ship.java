package Lesson3_2;

public class Ship extends  Vehicle{
    String city;
    int pass;

    public Ship(int price, int speed, int year, byte[] coordinates, int pass, String city){
        super.Vehicle(price, speed, year, coordinates);
        this.city = city;
        this.pass = pass;
    }
    public void PrintShip(){
        System.out.print("City: " + city + ", pass: " + pass + "," + super.Print());
    }
}
