import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    String name;
    String surname;
    int age;
    String studentType;
    String gender;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    abstract public StudentBuilder setStudentType();

    public Student build() {
        return new Student(this);
    }

}
