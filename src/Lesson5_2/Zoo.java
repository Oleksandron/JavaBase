package Lesson5_2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Lyons");
        zoo.add(1, "Girafes");
        zoo.add(2, "Bears");
        zoo.add(3, "Elephants");
        zoo.add(4, "Monkeys");
        zoo.add(5, "Snakes");
        zoo.add(6, "Penguins");
        zoo.add(7, "Birds");
        System.out.print("Zoo size: ");
        System.out.println(zoo.size());
        for (String s : zoo) {
            System.out.print(s + " ");
        }
        zoo.remove(2);
        zoo.remove(3);
        zoo.remove(4);
        zoo.size();
        System.out.print("\nZoo size: ");
        System.out.println(zoo.size());
        for (String s : zoo) {
            System.out.print(s + " ");
        }
    }
}
