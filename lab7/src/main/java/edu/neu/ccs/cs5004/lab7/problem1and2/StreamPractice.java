package edu.neu.ccs.cs5004.lab7.problem1and2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

  public static void main(String[] argv) {
    List<Integer> grades1 = new ArrayList<Integer>();
    grades1.add(100);
    grades1.add(90);
    grades1.add(98);
    //courseList.forEach(student->student.getGrades().stream().map(g->g).average().getAsDouble())
    List<Integer> grades2 = new ArrayList<>();
    grades2.add(99);
    grades2.add(93);
    grades2.add(95);
    List<Integer> grades3 = new ArrayList<>();
    grades3.add(89);
    grades3.add(92);
    grades3.add(91);
    Student s1 = new Student("Joe Green", "ABC", grades1);
    Student s2 = new Student("Lily Lee", "EGF", grades2);
    Student s3 = new Student("Harry Green", "TGN", grades3);
    List<Student> courseList = new ArrayList<>();
    courseList.addAll(Arrays.asList(s1, s2, s3));
    for (Integer grade : s1.getGrades()) {
      if (grade > 95) {
        System.out.println(grade);
      }
    }
    s1.getGrades().stream().filter(g -> g.compareTo(95) > 0).forEach(System.out::println);
    Integer total = s1.getGrades().stream().mapToInt(g -> g).sum();
    Double avg = s1.getGrades().stream().mapToInt(g -> g).average().getAsDouble();
    // find the highest grade of all students in course1
    Integer high1 = courseList.stream().map(s -> s.getGrades().get(0)).max(Integer::compareTo)
        .get();
    System.out.println(high1);
    // find the highest grade of all students in course2
    Integer high2 = courseList.stream().map(s -> s.getGrades().get(1)).max(Integer::compareTo)
        .get();
    System.out.println(high2);
    // find the highest grade of all students in course3
    Integer high3 = courseList.stream().map(s -> s.getGrades().get(2)).max(Integer::compareTo)
        .get();
    System.out.println(high3);
    // find the average grade of all students in course1
    Double avg1 = courseList.stream().mapToInt(s -> s.getGrades().get(0)).average().getAsDouble();
    System.out.println(avg1);
    // find the average grade of all students in course2
    Double avg2 = courseList.stream().mapToInt(s -> s.getGrades().get(1)).average().getAsDouble();
    System.out.println(avg2);
    // find the average grade of all students in course3
    Double avg3 = courseList.stream().mapToInt(s -> s.getGrades().get(2)).average().getAsDouble();
    System.out.println(avg3);
    // Get the list of students with grades above the average for the course1
    List<Student> course1 = courseList.stream().filter(s -> s.getGrades().get(0) > avg1).collect(
        Collectors.toList());
    course1.forEach(s -> System.out.println(s.getName()));
    // Get the list of students with grades above the average for the course2
    List<Student> course2 = courseList.stream().filter(s -> s.getGrades().get(1) > avg2).collect(
        Collectors.toList());
    course2.forEach(s -> System.out.println(s.getName()));
    // Get the list of students with grades above the average for the course3
    List<Student> course3 = courseList.stream().filter(s -> s.getGrades().get(2) > avg3).collect(
        Collectors.toList());
    course3.forEach(s -> System.out.println(s.getName()));
    // Get the list of the students’ email addresses
    List<String> emailList = courseList.stream().map(s -> s.getLogin() + "@husky.neu.edu").collect(
        Collectors.toList());
    emailList.forEach(s -> System.out.println(s));

    Function<String, String> makeEmail = s -> s + "@husky.neu.edu";
    String newEmail = makeEmail.apply(s1.getLogin());
    System.out.println(newEmail);

    Function<Student, Student> updateLogin = s -> new Student(s.getName(),
        s.getLogin() + "@husky.neu.edu", s.getGrades());
    List<Student> updateCourse = courseList.stream().map(updateLogin::apply)
        .collect(Collectors.toList());

    //  Create function object that will add new grades to a student’s grade list.
    List<Integer> newList = new ArrayList<>();
    newList.add(88);
    Function<Student, Student> updateGrade = s -> new Student(s.getName(),
        s.getLogin(),
        Stream.concat(s.getGrades().stream(), newList.stream()).collect(Collectors.toList()));

    List<Student> updateCourse2 = courseList.stream().map(updateGrade::apply)
        .collect(Collectors.toList());
  }
}






