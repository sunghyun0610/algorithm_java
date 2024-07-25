//package java_hard;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StreamTest {
//    public static void main(String[] args) {
//        Student[] students = new Student[9];
//
//        students[0] = new Student("조믿음", 25, 95);
//        students[1] = new Student("이준호", 22, 85);
//        students[2] = new Student("양유진", 20, 100);
//        students[3] = new Student("조믿음", 25, 95);
//        students[4] = new Student("이준호", 22, 85);
//        students[5] = new Student("양유진", 20, 100);
//        students[6] = new Student("이준호", 22, 85);
//        students[7] = new Student("양유진", 20, 100);
//        students[8] = new Student("조믿음", 25, 95);
//
////        List<Student> list = Arrays.stream(students).sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
////                .filter(s->s.getScore()>80)
////                .collect(Collectors.toList());
//
//        List<Student> list = Arrays.stream(students).sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
//                .filter(s->s.getScore()>80)
//                .collect(Collectors.toList());
//    }
//
////        List<Student> list = Arrays.stream(students)
////                .filter(s -> s.getScore() > 80)
////                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
////                .collect(Collectors.toList());
//
//    }
//}
//
//class Student {
//    private String name;
//    private int age;
//    private int score;
//
//    public Student(String name, int age, int score) {
//        this.name = name;
//        this.age = age;
//        this.score = score;
////    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", score=" + score +
//                '}';
//    }
//}