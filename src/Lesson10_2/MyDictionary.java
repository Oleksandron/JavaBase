package Lesson10_2;

import java.util.HashMap;

public class MyDictionary<TKey, TValue> {
    HashMap<TKey, TValue> dictionary = new HashMap<TKey, TValue>();

    public HashMap<TKey, TValue> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<TKey, TValue> dictionary) {
        this.dictionary = dictionary;
    }

    public void addElem(TKey k, TValue v) {
        dictionary.put(k, v);
    }

    public TValue val(TKey k) {
        return dictionary.get(k);
    }

    public int size() {
        return dictionary.size();
    }


    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.addElem("1", "key");
        myDictionary.addElem("2", "key");
        myDictionary.addElem("3", "key");
        System.out.println(myDictionary.size());
    }
}
