package chapter01_arrayandstring.subject01_map;

import java.util.HashMap;
import java.util.Map;

public class Demo01_BuildMap {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "张三");
        students[1] = new Student(2, "李四");
        students[2] = new Student(3, "王五");
        HashMap<Integer, Student> map = new Demo01_BuildMap().buildMap(students);
        for (Map.Entry<Integer, Student> studentEntry : map.entrySet()) {
            System.out.print(studentEntry.getKey()+"="+studentEntry.getValue());
            System.out.println();
        }
    }

    public HashMap<Integer,Student> buildMap(Student[] students){
        HashMap<Integer,Student> map = new HashMap<Integer,Student>();
        for (int i = 0; i < students.length; i++) {
            map.put(new Integer(students[i].getId()),students[i]);
        }
        return map;
    }
}
