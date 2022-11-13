package Lesson9_1;

public class Main {
    public static void main(String[] args) {
        Device acer = new Device("Acer",133,"CA123456789");
        System.out.println(acer.getManufacturer() + ", price: " + acer.getPrice() + " $, Serial Number: " + acer.getSerialNumber());
        Monitor asus = new Monitor("Asus", 150, "AS123456789", 1920, 1280);
        System.out.println(asus.getManufacturer() + ", price: " + asus.getPrice() + " $, Serial Number: " + asus.getSerialNumber() +
                ", resolution: " + asus.getResolutionX() + "x" + asus.getResolutionY());
    }
}
