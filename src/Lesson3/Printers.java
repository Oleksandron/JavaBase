package Lesson3;

public class Printers extends Printer{
    @Override
    void print(String velue) {
        super.print((char)27 + "[31m" + velue);
        super.print((char)27 + "[32m" + velue);
        super.print((char)27 + "[33m" + velue);
        super.print((char)27 + "[34m" + velue);
        super.print((char)27 + "[35m" + velue);
        super.print((char)27 + "[36m" + velue);
        super.print((char)27 + "[37m" + velue);
        super.print((char)27 + "[38m" + velue);
    }
}
