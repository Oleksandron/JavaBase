package Lesson4_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TXTHandler txt = new TXTHandler();
        XMLHandler xml = new XMLHandler();
        DOCHandler doc = new DOCHandler();
        System.out.println("Enter file name, DOC, XML or TXT: ");
        Scanner in = new Scanner(System.in);
        String handler = in.nextLine();
        switch (handler){
            case "XML":
                System.out.println("Entering XML-file.");
                xml.open();
                xml.create();
                xml.change();
                xml.save();
                break;
            case "TXT":
                System.out.println("Entering TXT-file.");
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;
            case "DOC":
                System.out.println("Entering DOC-file.");
                doc.open();
                doc.create();
                doc.change();
                doc.save();
                break;
            default:
                System.out.println("You enter incorrect file name!");
        }
    }
}
