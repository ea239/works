/*
name: Evan Zhang
Date: 2022. 11。 20
Program name: the class to provide the address of a student
 */
package Problem_Set_3;

public class Student {
    //four initial variable, including two Address.
    private String firstN;
    private String lastN;
    private Address home;
    private Address school;

    //create the instance of the class
    public Student(String firstN, String lastN, Address home, Address school){
        this.firstN = firstN;
        this.lastN = lastN;
        this.home = home;
        this.school = school;
    }

    //the accessor and the mutator and the accessor
    public String getFirstN() {
        return firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public Address getHome() {
        return home;
    }

    public Address getSchool() {
        return school;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public void setSchool(Address school) {
        this.school = school;
    }

    //toString method to show the address information of the student
    public String toString(){
        return ("First name: " + firstN + "\nLast name: " + lastN + "\nHome address:\n" + home.toString() + "\nSchool address:\n" + school.toString());
    }
}
