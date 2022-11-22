import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static class Student{
        String f_name;
        String l_name;
        int age;

        public Student(String f_name, String l_name, int age) {
            this.f_name = f_name;
            this.l_name = l_name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "First Name='" + f_name + '\'' +
                    ", Last Name='" + l_name + '\'' +
                    ", Age=" + age +
                    '}';
        }

        public String getF_name() {
            return f_name;
        }

        public void setF_name(String f_name) {
            this.f_name = f_name;
        }

        public String getL_name() {
            return l_name;
        }

        public void setL_name(String l_name) {
            this.l_name = l_name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Nafiul","Islam",1);
        Student s2 = new Student("Nafiul","Islam",2);
        Student s3 = new Student("Nafiul","Islam",21);
        Student s4 = new Student("Nafiul","Islam",30);
        List<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        List<Student> printStudent = student.stream().map(s-> s).collect(Collectors.toList());
//        System.out.println(printStudent);
        List<Student> filterStudent = student.stream().filter(s -> s.getAge() > 25)
                .map(s -> s).toList();
//        System.out.println(filterStudent);
        long sumAge = student.stream().map(s->s.getAge()).mapToInt(Integer::intValue).sum();
//        System.out.println(sumAge);
        numberToWord numberToWord = new numberToWord();
    }
}