package Lesson8_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Price test = new Price();
        String[] shops = new String[2];
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < shops.length; i++) {
            System.out.println("Enter product name: ");
            test.setName(in.nextLine());
            System.out.println("Enter shop name: ");
            test.setShop(in1.nextLine());
            System.out.println("Enter price: ");
            test.setPrice(in2.nextInt());
            String str = " " + test.getPrice();
            shops[i] = test.getShop() + " " + test.getName() + str;
        }
        test.sortArray(shops);
        System.out.println("Enter shop name: ");
        test.setShop(in1.nextLine());
        for (int i = 0; i < shops.length; i++) {
            try {
                String str = shops[i];
                if(test.getShop().regionMatches(0,str,0,test.getShop().length()))  System.out.println(shops[i]);
            }catch (Exception e){
                System.out.println("That shop doesn't exist");
                System.out.println(e.getMessage());
            }
        }
    }
}
