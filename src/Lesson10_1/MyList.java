package Lesson10_1;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void addElem(T elem) {
        list.add(elem);
    }

    public int val(T elem) {
        return list.indexOf(elem);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.addElem("11");
        myList.addElem("22");
        myList.addElem("33");
        System.out.println(myList.size());

    }
}
