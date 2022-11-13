package Lesson7;

    public enum Vehicles {
        FIAT(1000), AUDI(5000), SCODA(2000), BMW(4000), SEAT(1500);
        int price;
        String color;

    Vehicles(int price) {
        this.price = price;
    }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Vehicle: " + name() +
                " Color: " + color +
                " Price: " + price ;
    }
}
