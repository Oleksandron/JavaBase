package Lesson6_1;

public class Vehicle {
    public  void  print(){
        System.out.println("Vehicle class, print method");
    }
    public class Wheel{
        public void print(){
            System.out.println("Wheel class, print method");
        }
    }
    public class Door{
        public void print(){
            System.out.println("Door class, print method");
        }
    }
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        vh.print();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        wheel.print();
        Vehicle.Door door = new Vehicle().new Door();
        door.print();
    }
}
