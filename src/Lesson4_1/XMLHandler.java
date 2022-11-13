package Lesson4_1;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("If the file is XML then it is open ");
    }

    @Override
    void create() {
        System.out.println("If the file is XML then it is create ");
    }

    @Override
    void change() {

        System.out.println("If the file is XML then it is change ");
    }

    @Override
    void save() {

        System.out.println("If the file is XML then it is save ");
    }
}
