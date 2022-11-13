package Lesson1_3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Author author1 = new Author();
        Title title1 = new Title();
        Content content1 = new Content();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter title: ");
        title1.title = in.nextLine();

        System.out.println("Enter author: ");
        author1.author = in.nextLine();

        System.out.println("Enter content: ");
        content1.content = in.nextLine();

        author1.show();
        title1.show();
        content1.show();
    }
}
