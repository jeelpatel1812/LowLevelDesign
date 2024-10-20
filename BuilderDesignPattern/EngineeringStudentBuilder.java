import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("CS");
        this.subjects = subjects;
        return this;
    }

    public StudentBuilder setStudentType() {
        this.studentType = "Engineering";
        return this;
    }
}
