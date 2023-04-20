package grades;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private static String name;
    private Integer grade;
    private static ArrayList<Integer> grades;

    public Student(String john, grades.ArrayList<List<Integer>> listArrayList) {

    }

    public Student(Comparable<String> john, java.util.ArrayList<Integer> integers) {

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

//    public Student(String name, Integer grade, ArrayList<Integer> grades) {
//        Student.name = name;
//        this.grade = grade;
//        this.grades = grades;
//    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public static ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public Student(String name) {
        Student.name = name;
        this.grades = new ArrayList<>();
    }
    public String name() {
        return name;
    }
}