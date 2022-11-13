package Lesson3_1;

public class GoodPupil extends Pupil{
    String gd = " Good! ";
    @Override
    void study() {
        super.study();
        System.out.print(gd);
    }

    @Override
    void read() {
        super.read();
        System.out.print(gd);
    }

    @Override
    void write() {
        super.write();
        System.out.print(gd);
    }

    @Override
    void relax() {
        super.relax();
        System.out.println(gd);
    }
}
