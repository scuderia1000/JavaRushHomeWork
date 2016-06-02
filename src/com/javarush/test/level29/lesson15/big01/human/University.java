package com.javarush.test.level29.lesson15.big01.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student studentWithMaxAverageGrade = students.get(0);
        double maxAverageGrade = studentWithMaxAverageGrade.getAverageGrade();
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverageGrade) {
                studentWithMaxAverageGrade = student;
                maxAverageGrade = studentWithMaxAverageGrade.getAverageGrade();
            }
        }
        return studentWithMaxAverageGrade;
    }

    public void getStudentWithMinAverageGradeAndExpel() {
        //TODO:
    }

    public Student getStudentWithMinAverageGrade() {
        Student studentWithMinAverageGrade = students.get(0);
        double minAverageGrade = studentWithMinAverageGrade.getAverageGrade();
        for (Student student : students) {
            if (student.getAverageGrade() < minAverageGrade) {
                studentWithMinAverageGrade = student;
                minAverageGrade = studentWithMinAverageGrade.getAverageGrade();
            }
        }
        return studentWithMinAverageGrade;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}
