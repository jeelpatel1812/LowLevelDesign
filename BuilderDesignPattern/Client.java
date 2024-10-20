public class Client {
    public static void main(String args[]) {
        Director directorObj = new Director(new EngineeringStudentBuilder());
        Student engineer = directorObj.createStudent();

        // Director directorObj2 = new Director(new MedicalStudentBuilder());
        // Student doctor = directorObj2.createStudent();

        // get Details
        engineer.getDetails();
    }
}