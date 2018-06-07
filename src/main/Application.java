package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 74));
        university.addStudent(new Student("Julia Veselkina", 68));
        university.addStudent(new Student("Maria Perechrest", 52));
        university.setStudent("studentsCH.U.I.xml"); //Студентов можно загружать с xml, но ВУЗ создавать в программе

        University university1 = new University("KhPI");
        university1.addStudent(new Student("Ivanov Ivan", 11));
        university1.addStudent(new Student("Didenko Konstantin", 9));
        university1.setStudent("studentsKhPI.xml");

        Internship internship = new Internship("Interlink");

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
