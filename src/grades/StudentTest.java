package grades;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentsArrayList = new ArrayList<>();

        Student student1 = new Student("Donna");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);
        System.out.println("Name: " + student1.getName() + ", Average: " + student1.getGradeAverage());

        Student student2 = new Student("Murphy");
        student2.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(70);
        System.out.println("Name: " + student2.getName() + ", Average: " + student2.getGradeAverage());


        }
    }








//package grades;
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentTest {
//    public static void main(String[] args) {
//        ArrayList<Student> studentsArrayList = new ArrayList<>();
//        studentsArrayList.add(new Student("John", new ArrayList<>(List.of(80, 55, 78, 29))));
//
////        for(Student student : studentsArrayList){
//            System.out.println(Student.getName());
//            System.out.println(Student.getGrades());
//            System.out.println(Student.getGradeAverage());
//        }
//    }

