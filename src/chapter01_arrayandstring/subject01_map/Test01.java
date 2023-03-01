package chapter01_arrayandstring.subject01_map;


/**
 * 实现一个算法，确定一个字符串的所有字符是否全都不同。假使不允许使用额外的数据结构，又该如何处理？
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str0 = "abcdefghijka";
        System.out.println(isUniqueChars(str));
        System.out.println(isUniqueChars(str0));
    }

    public static boolean isUniqueChars(String str){
        if(str.length()>256){
            return false;
        }
        boolean[] charset = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(charset[val]){
                return false;
            }
            charset[val] = true;
        }
        return true;
    }

    /*
    public static boolean isUniqueChars2(String str){
        if
    }
    */
}
