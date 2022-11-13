package Lesson8_2;

import java.util.Arrays;

public class Price {
    private String name;
    private String shop;
    private int price;

    public Price() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static void sortArray(String[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
