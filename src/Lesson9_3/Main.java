package Lesson9_3;

public class Main {
    public static void main(String[] args) {
        Device samsung1 = new Device("Samsung", 120, "AB1234567CD");
        Monitor samsung2 = new Monitor("Samsung", 120, "AB1234567CD", 1920, 1280);
        Device acer = new Device("Acer", 133, "CA123456789");
        Monitor asus = new Monitor("Asus", 150, "AS123456789", 1920, 1280);
        Monitor samsung3 = samsung2;
        Device acer1 = new Device("Acer", 133, "CA123456789");
        System.out.println(samsung1.equals(samsung2));
        System.out.println(samsung1.hashCode() + " " + samsung2.hashCode() + " " + samsung3.hashCode());
        System.out.println(samsung2.equals(samsung3));
        System.out.println(acer.equals(asus));
        System.out.println(acer.hashCode() + " " +asus.hashCode() + " " + acer1.hashCode());
        System.out.println(acer1.equals(acer));
    }
}
