package Generics.GenericExtra;

import Generics.GenericExtra.model.LPAStudent;
import Generics.GenericExtra.model.Student;
import Generics.GenericExtra.utill.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);
        prinMoretList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python"
        );

        prinMoretList(matches);

        var students2021 =
                QueryList.getMatches(students, "YearStarted", "2021");
        prinMoretList(students2021);

//        QueryList<Employee> employeeList = new QueryList<>();
    }

    public static <T extends Student> void printList(List<T> students) {

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void prinMoretList(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }
}