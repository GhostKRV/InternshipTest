package person;

import person.consciousness.Knowledge;

import java.util.Objects;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, int level) {
        this.name = name;
        this.knowledge = new Knowledge(level);
    }

//    public void setKnowledge(Knowledge knowledge) {
//        //TODO: Implementation is needed
//        this.knowledge = knowledge;
//    }

    public String getName(){
        return name;
    }

    public int getKnowledge(){
        return knowledge.getLevel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(knowledge, student.knowledge);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, knowledge);
    }
}
