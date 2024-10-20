import java.util.ArrayList;
import java.util.List;

public class MedicalStudentBuilder extends StudentBuilder {

    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Human Body");
        subjects.add("Tree Structure");
        this.subjects = subjects;
        return this;
    }

    public StudentBuilder setStudentType() {
        this.studentType = "Medical";
        return this;
    }
}