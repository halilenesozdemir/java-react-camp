public class Main {
    public static void main(String[] args){
            Student student1 = new Student("Halil Enes","Ozdemir",1,"10101010110", new String[]{"Java", "React"},"Gazi");
            Student student2 = new Student("Mehmet Emir","Ozdemir",2,"1241241", new String[]{"C#", "Angular"},"Hacettepe");

            Instructor instructor1 = new Instructor("Engin","Demirog",1,"124124",new String[]{"Java","React"},new String[]{"Java","React"});
            Instructor instructor2 = new Instructor("Murat","Yucedag",2,"1241245",new String[]{"C#","Angular"},new String[]{"C#","Angular"});

            StudentManager studentManager = new StudentManager();
            Student[] students = {student1,student2};
            studentManager.addMultipleStudent(students);


            InstructorManager instructorManager = new InstructorManager();
            instructorManager.listTaughtedCourses(instructor1.taughtedCourses);


    }
}
