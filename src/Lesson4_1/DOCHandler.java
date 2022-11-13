package Lesson4_1;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("If the file is DOC then it is open ");
    }

    @Override
    void create() {
        System.out.println("If the file is DOC then it is create ");
    }

    @Override
    void change() {
        System.out.println("If the file is DOC then it is change ");
    }

    @Override
    void save() {
        System.out.println("If the file is DOC then it is save ");
    }
}
