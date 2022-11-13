package Lesson3_1;

public class Main {
    public static void main(String[] args) {
        ClassRoom room = new ClassRoom( new GoodPupil(),
                new BadPupil(),
                new ExelentPupil());

        System.out.print("Anna is: "); room.anna.read();
        System.out.print("Piter is: "); room.maks.relax();
        System.out.print("Lena: "); room.piter.relax();

    }
}

