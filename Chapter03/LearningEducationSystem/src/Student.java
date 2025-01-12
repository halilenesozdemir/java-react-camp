public class Student extends User {
    String[] enrolledCourses;
    String university;

    public Student(String name, String surname, int id, String citizenshipNumber, String[] enrolledCourses, String university) {
        super(name, surname, id, citizenshipNumber);
        this.enrolledCourses = enrolledCourses;
        this.university = university;
    }
}
