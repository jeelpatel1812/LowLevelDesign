public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        // for same calls
        return createCommonStudentBuilder();

        // for different calls
        // if(this.studentBuilder instanceof MedicalStudentBuilder){
        // return createMedicalStudentBuilder();
        // }
        // else if(this.studentBuilder instanceof EngineeringStudentBuilder){
        // return createMedicalStudentBuilder();
        // }
        // return null;

    }

    // for common fields just subjects can be different
    public Student createCommonStudentBuilder() {
        return studentBuilder.setRollNumber(30).setAge(10).setName("JEEL").setSurname("PATEL").setSubjects()
                .setStudentType().build();
    }

    public Student createMedicalStudentBuilder() {
        return studentBuilder.setRollNumber(30).setAge(10).setName("JEEL").setSubjects().setStudentType().build();
    }

    public Student createEngineeringStudentBuilder() {
        return studentBuilder.setRollNumber(22).setAge(22).setName("JEEL").setSubjects().setStudentType().build();
    }
}