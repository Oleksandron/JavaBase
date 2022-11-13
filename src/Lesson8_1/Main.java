package Lesson8_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Worker test = new Worker();
        String[] worker = new String[5];
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < worker.length; i++) {
            System.out.print("Enter worker. ");
            System.out.println("Enter first name and second name: ");
            test.setfName(in.nextLine());
            System.out.println("Enter current position: ");
            test.setJobTitle(in1.nextLine());
            System.out.println("Enter year: ");
            try {
                test.setYearJob(in2.nextInt());
                String str = " " + test.getYearJob();
                worker[i] = test.getfName() + " " + test.getJobTitle() + str;
            } catch (Exception e) {
                System.out.println("Enter only digit!");
                break;
            }
        }
        test.dataOut(worker);
        System.out.println("------------------------------");
        test.sortArray(worker);
        System.out.println("Enter year jobs: ");
        int years = in.nextInt();
        test.yearsWork(worker, years);
    }
}

