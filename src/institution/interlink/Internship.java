package institution.interlink;

import institution.University;
import person.Student;

import java.util.LinkedList;
import java.util.List;

public class Internship {
    private List <Student> studentsIntership = new LinkedList<>();
    private String name;

    public Internship(String name) {
        //TODO: Implementation is needed
        this.name = name;
    }

    //public void setStudent(Student student) {
    public void setStudent() {                                               // Метод добавляет всех студентов у которых
        //TODO: Implementation is needed                                     //  оценка выше среднего по определённому вузу
        for(University university : University.getUniversities()){           // Проходим по каждому университету
            int avgLevel = university.averageKnowledge();
            for(Student student : university.getStudents()){                 // Получаем список студентов в определенном вузе
                if(avgLevel <= student.getKnowledge()){                       // Сравниваем средний балл с оценкой студента
                    studentsIntership.add(student);                          //
                }
            }
        }
    }

    public String getStudents() {
        //TODO: Implementation is needed
        this.setStudent();

        String studentInternshipList = "";

        for(Student student : studentsIntership){
            studentInternshipList += student.getName() + "\n";
        }
        return studentInternshipList;

        //return "Andrew Maslenko\nJulia Veselkina\n";
    }
}
