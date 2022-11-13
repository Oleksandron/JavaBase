package Lesson3_2;

public class Main {
    public static void main(String[] args) {
        Plane setra = new Plane(1225555, 465, 2000,new byte []{17, 22, 76}, 1200, 21);
        setra.PrintPlane();
        Ship sea = new Ship(255516, 37, 2001, new byte[]{12,65,12}, 64, "Odessa");
        sea.PrintShip();
    }
}
