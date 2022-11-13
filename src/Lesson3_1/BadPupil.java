package Lesson3_1;

public class BadPupil extends Pupil{
    String bd = " Bad! ";
    @Override
    void study() {
        super.study();
        System.out.print(bd);
    }

    @Override
    void read() {
        super.read();
        System.out.print(bd);
    }

    @Override
    void write() {
        super.write();
        System.out.print(bd);
    }

    @Override
    void relax() {
        super.relax();
        System.out.println(bd);
    }
}
