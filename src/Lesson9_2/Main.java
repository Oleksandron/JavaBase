package Lesson9_2;

public class Main {
    public static void main(String[] args) {
        Device samsung1 = new Device("Samsung",120,"AB1234567CD");
        System.out.println(samsung1);
        Monitor samsung2 = new Monitor("Samsung",120,"AB1234567CD",1920,1280);
        System.out.println(samsung2);
    }
}
