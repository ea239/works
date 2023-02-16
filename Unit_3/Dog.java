package Unit_3;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public int peronAge(){
        return age *7;
    }


    public String toString() {
        return ("the dog's name is " + name + ", and the age is " + age + ".");
    }



}
