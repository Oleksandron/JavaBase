package Lesson1;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house;
    int appartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getAppartment() {
        return appartment;
    }

    public void setAppartment(int appartment) {
        this.appartment = appartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index=0" + index +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", appartment=" + appartment +
                '}';
    }
}
