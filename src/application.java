import java.util.*;
import java.util.stream.Collectors;

public class application {





    public static void main(String[] args) {
    Student.createStudents();
    Student.createSetofStudents(Student.getStudentsList());
    Student.createMapOfStudents(Student.getStudentsList());
    //Student.sorteredListByAge(Student.getStudentsList());
        // Student.countStudentsInList(Student.getStudentsList());
    //Student.countDistinctStudentsInList(Student.getStudentsList());

    Student.printMapInStringFormat(Student.mapOfStudents);

    }

}
