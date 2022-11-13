package Lesson8_1;

import java.time.LocalDate;
import java.util.Arrays;

public class Worker {
    private String fName;
    private String jobTitle;
    private int yearJob;

    public Worker() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearJob() {
        return yearJob;
    }

    public void setYearJob(int yearJob) {
        this.yearJob = yearJob;
    }

    public static void sortArray(String[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }

    public static void dataOut(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void yearsWork(String[] arr, int y) {
        int year = LocalDate.now().getYear();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String digits = "";
            for (int j = 0; j < s.length(); j++) {
                char chrs = s.charAt(j);
                if (Character.isDigit(chrs))
                    digits = digits + chrs;
            }
            int num = Integer.parseInt(digits);
            if ((year - num) > y) System.out.println(s);
        }
    }
}
