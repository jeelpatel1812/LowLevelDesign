import java.util.List;

public class Student {
    int rollNumber;
    String name;
    String surname;
    int age;
    String studentType;
    String gender;
    List<String> subjects;

    enum GENDER {
        MALE,
        FEMALE,
        OTHER
    }

    Student(StudentBuilder sb) {
        this.rollNumber = sb.rollNumber;
        this.name = sb.name;
        this.surname = sb.surname;
        this.age = sb.age;
        this.subjects = sb.subjects;
        this.studentType = sb.studentType;
    }

    public void getDetails() {
        System.out.println("\nSTUDENT DETAIL\n--------------");
        System.out.println("ROLL NO: " + this.rollNumber);
        System.out.println("NAME: " + this.name + " " + this.surname);
        System.out.println("AGE: " + this.age);
        System.out.println("CATEGORY: " + this.studentType);
        System.out.print("SUBJECTS: ");
        int i = 0;
        for (String sub : subjects) {
            if (i > 0)
                System.out.print(", ");
            System.out.print(sub);
            i++;
        }
    }
}
