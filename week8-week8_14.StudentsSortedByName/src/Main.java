import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("abood");
        Student fourth = new Student("z");
        students.add(first);
        students.add(second);
        students.add(third);
        students.add(fourth);
        System.out.println(first.compareTo(second));
        System.out.println(students);
    }
}
