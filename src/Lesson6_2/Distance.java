package Lesson6_2;

import java.util.Scanner;

public class Distance {
    public void print(){
        System.out.println("Distance class, print method");
    }
    public static class Converter {
        double  km, miles, foot, nm;
        public double meterInKm( double meter){
            return km = 0.001 * meter;
        }
        public double meterInMiles(double meter){
            return miles = 1.60934 * meter;
        }
        public double meterInFoot(double meter){
            return foot = 0.3048 * meter;
        }
        public double meterInNm(double meter){
            return nm = 1.852 * meter;
        }

        public static void main(String[] args) {
            Distance ds = new Distance();
            ds.print();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter distance in meters: ");
            double distance = in.nextDouble();
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter system convert: Km , Mls , Ft , Nm ");
            String system = in2.nextLine();
            Distance.Converter convert = new Distance.Converter();
            switch (system){
                case"Ft":
                    System.out.println(convert.meterInFoot(distance));
                    break;
                case"Km":
                    System.out.println(convert.meterInKm(distance));
                    break;
                case"Mls":
                    System.out.println(convert.meterInMiles(distance));
                    break;
                case"Nm":
                    System.out.println(convert.meterInNm(distance));
                    break;
                default:
                    System.out.println("Error enter system");
            }
        }
    }
}
