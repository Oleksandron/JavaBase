package Lesson3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentWorker base = new DocumentWorker();
        DocumentWorker pro = new ProDocumentWorker();
        DocumentWorker exp = new ExpertDocumentWorker();
        Scanner license = new Scanner(System.in);
        int key;
        System.out.println("Enter your license key: 1 - Base  2 - Pro  3 - Expert ");
        key = license.nextInt();
        switch (key){
            case 1: base.openDocument();
            base.editDocument();
            base.saveDocument();
            break;
            case 2: pro.openDocument();
            pro.editDocument();
            pro.saveDocument();
            break;
            case 3: exp.openDocument();
            exp.editDocument();
            exp.saveDocument();
            break;
            default:
                System.out.println("You enter incorrect key!");
        }

    }
}
