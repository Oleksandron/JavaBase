package Lesson7;

public class Main {
    public static void main(String[] args) {
        Vehicles myFiat = Vehicles.FIAT;
        String fiatColor = "Green";
        myFiat.setColor(fiatColor);
        System.out.println(myFiat);
        Vehicles myAudi = Vehicles.AUDI;
        String audiColor = "Blue";
        myAudi.setColor(audiColor);
        System.out.println(myAudi);
        Vehicles myScoda = Vehicles.SCODA;
        String scodaColor = "Red";
        myScoda.setColor(scodaColor);
        System.out.println(myScoda);
        Vehicles myBmw = Vehicles.BMW;
        String bmwColor  = "Black";
        myBmw.setColor(bmwColor);
        System.out.println(myBmw);
        Vehicles mySeat = Vehicles.SEAT;
        String seatColor = "White";
        mySeat.setColor(seatColor);
        System.out.println(mySeat);
    }
}
