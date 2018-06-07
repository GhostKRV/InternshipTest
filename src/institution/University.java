package institution;

import person.Student;
import reader.XMLReader;

import java.util.LinkedList;
import java.util.List;

public class University {
    private static List <University> universities = new LinkedList<>(); // Список всех вузов
    private List <Student> students = new LinkedList<>();
    private String name;

    public University(String name) {
        this.name = name;
        University.addUniversity(this);
    }

    private static void addUniversity(University university){ // При создании ВУЗ будет добавлен в список вузов
        universities.add(university);                         // Вызваеться в конструкторе
    }

    public String getName() {
        return name;
    }

    public static List <University> getUniversities(){
        return universities;
    }

    public void setStudent(String path) {                   // Добавляем студентов из XML
        //TODO: Implementation is needed
        students.addAll(XMLReader.readStudentsXML(path));
    }

    public int averageKnowledge(){
        double avgLevel = 0;
        for(Student student : students){
            avgLevel += student.getKnowledge();
        }
        int result = (int) Math.round(avgLevel / (double) students.size()); // Округляем средний балл
        return result;
    }

    public List <Student> getStudents(){
        return students;
    }

    public void addStudent(Student student) {
        //TODO: Implementation is needed
        students.add(student);
    }
}
