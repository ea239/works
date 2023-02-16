package Unit_3;

public class Kennel {
    public static void main(String[] arg){
        Dog[] dogs = new Dog[4];
        Dog dog1 = new Dog("Henry", 7);
        Dog dog = new Dog("Steven", 3);
        dogs[2] = new Dog("Jack", 11);
        dogs[3] = new Dog("Louis", 5);
        dog1 = dog;
        System.out.println(dog.getAge());
    }
}
