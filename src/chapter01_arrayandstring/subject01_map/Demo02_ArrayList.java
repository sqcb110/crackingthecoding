package chapter01_arrayandstring.subject01_map;

import java.util.ArrayList;

public class Demo02_ArrayList {
    public static void main(String[] args) {

    }

    public static ArrayList<String> merge(String[] words,String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for (String word : words) {
            sentence.add(word);
        }
        for (String m : more) {
            sentence.add(m);
        }
        return sentence;
    }
}
