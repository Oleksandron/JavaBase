package Lesson3_1;

public class ExelentPupil extends Pupil{
    String exl = " Exelent! ";
    @Override
    void study() {
        super.study();
        System.out.print(exl);
    }

    @Override
    void read() {
        super.read();
        System.out.print(exl);
    }

    @Override
    void write() {
        super.write();
        System.out.print(exl);
    }

    @Override
    void relax() {
        super.relax();
        System.out.println(exl);
    }
}
