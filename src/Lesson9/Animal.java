package Lesson9;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }

    @Override
    public String toString() {
        if (tail == true) return "Имя: " + name + ", возраст: " + age + ", хвост: есть";
        else return "Имя: " + name + ", возраст: " + age + ", хвост: нет";
    }
}
