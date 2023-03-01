package chapter01_arrayandstring.subject01_map;

public class Demo03_StringBuffer {
    public static void main(String[] args) {

    }
    public static String joinWords(String[] words){
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
