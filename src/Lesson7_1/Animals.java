package Lesson7_1;

public enum Animals {
    BIRDS(5), LIONS(11),ELEPHANT(3),PENGUINS(8),MONKEYS(15),BEARS(25);
    int age;
    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals: " + name() +
                " age = " + age;
    }
}
