package Lesson1;

public class Addr {
    public static void main(String[] args) {

        Address my = new Address();
        my.setIndex(2055);
        my.setCountry("Ukraine");
        my.setCity("Kyiv");
        my.setStreet("Grigorenko");
        my.setHouse(14);
        my.setAppartment(218);
        System.out.println(my);

        Address kum = new Address();
        kum.setIndex(1257);
        kum.setCountry("Ukraine");
        kum.setCity("Kyiv");
        kum.setStreet("Vokzal'na");
        kum.setHouse(51);
        kum.setAppartment(93);
        System.out.println(kum);

    }

}
