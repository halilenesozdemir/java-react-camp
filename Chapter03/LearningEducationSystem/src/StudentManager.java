public class StudentManager {

    public void addStudent(Student student){
        System.out.println(student.getName() + "eklendi");
    }
    public void addMultipleStudent(Student[] students){
        for(Student student:students){
            System.out.println(student.getName() + "eklendi.");
        }
    }
}
