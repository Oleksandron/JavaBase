package Lesson5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teacher = new ArrayList<>();
        teacher.add("Mathematics");
        teacher.add("History");
        teacher.add("Geografphy");
        teacher.add("Literatura");
        teacher.add("Geometry");
        teacher.add("Informatics");
        teacher.add("Drawing");
        teacher.add("Chemistry");
        teacher.add("Algebra");
        teacher.add("Botany");
        teacher.add("English");
        teacher.add("Biology");
        teacher.add("Physic");
        teacher.add("Music");
        System.out.print("My school teacher: ");
        for (String s: teacher) {
            System.out.print(s + " ");
        }
        System.out.println("\nMy bad teacher: ");
        int bad = teacher.indexOf("Literatura");
        System.out.println(bad);
        System.out.println("My best teacher: ");
        int best = teacher.indexOf("Physic");
        System.out.println(best);
    }
}
