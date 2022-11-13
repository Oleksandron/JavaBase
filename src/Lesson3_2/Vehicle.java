package Lesson3_2;

class Vehicle {
    private int price;
    private  int speed;
    private  int year;
    private byte [] coordinates;

    public void Vehicle(int price, int speed, int year, byte[] coordinates) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.coordinates = coordinates;
    }

    public String Print(){
        String result = "Price: " + price + ", speed: "+ speed + ", Coordinates: " + coordinates[0]+", "+coordinates[1]+", "+coordinates[2] + ". ";
        return result;
    }
}
