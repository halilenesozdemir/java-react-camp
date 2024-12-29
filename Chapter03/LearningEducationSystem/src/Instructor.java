public class Instructor  extends  User{
    String[] taughtedCourses;
    String[] expertise;

    public Instructor(String name, String surname, int id, String citizenshipNumber,String[] taughtedCourses,String[] expertise){
        super(name, surname, id, citizenshipNumber);
        this.taughtedCourses = taughtedCourses;
        this.expertise = expertise;

    }
}


