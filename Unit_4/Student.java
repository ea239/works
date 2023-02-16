package Unit_4;

public class Student extends People{
    int studentID;
    public Student(String name, int age, int studentID){
        super(name, age);
        this.studentID = studentID;
    }
}
