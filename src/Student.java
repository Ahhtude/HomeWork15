import java.util.*;
import java.util.stream.Collectors;

public class Student {

        private String name;
        private double age;
        private int mark;

        public static List<Student> testList = new ArrayList<>();

        public static Set setOfStudents;

        public static Map<String, Student> mapOfStudents;

        public static List<Student> sorteredList;

    public Student(String name, double age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public static void createStudents(){
        Student student1 = new Student("Alex",15,1);
        Student student2 = new Student("Georg",16,2);
        Student student3 = new Student("Lesli",18,3);
        Student student4 = new Student("Jordan",22,4);
        Student student5 = new Student("Lex",14,5);
        testList.add(student1);
        testList.add(student2);
        testList.add(student3);
        testList.add(student4);
        testList.add(student5);
    }

    public static void createSetofStudents(List list){
        setOfStudents = Student
                .getStudentsList()
                .stream().collect(Collectors.toSet());

        setOfStudents
                .stream()
                .forEach(a ->
            System.out.println(a.toString())
        );
    }

    public static void createMapOfStudents(List<Student> list){

        mapOfStudents = list
                .stream()
                .collect(Collectors.toMap(
                a-> a.getName(),
                b-> b
        ));
    }

    public static void sorteredListByAge(List<Student> list){

        list
                .forEach(a-> System.out.println(a.getName()));

        sorteredList = list
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        sorteredList
                .forEach(a-> System.out.println(a.getName()));
    }

    public static void countStudentsInList(List<Student> list){

        long i = list.stream().count();

       System.out.println(i);
    }

    public static void countDistinctStudentsInList(List<Student> list){

        long i = list.stream().distinct().count();

        System.out.println(i);

    }

    public static void printMapInStringFormat(Map<String,Student> map){

        map.entrySet()
                .stream().forEach(entry ->
            System.out.println(String.format("Key %s value %s",entry.getKey(),entry.getValue()))
        );

    }

    public static List<Student> getStudentsList() {

        return testList;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }
}
