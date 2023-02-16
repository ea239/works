/*
name: Evan Zhang
Date: 2022. 11。 20
Program name: A tester for Student class
 */
package Problem_Set_3;

public class StudentBody {
    public static void main(String[] arg){
        Student[] students = new Student[3];
        students[0] = new Student("Evan", "Zhang",
                new Address("30 Raymond Bartlett Ave.", "Markham", "Ontario", "L3R5H7"),
                new Address("217 Brookbanks Dr", "North York", "Ontario", "M3A 2T7"));
        students[1] = new Student("Henry", "Shi",
                new Address("73 Aldershot Crescent", "North York", "Ontario", " M2P 1M2"),
                new Address("217 Brookbanks Dr", "North York", "Ontario", "M3A 2T7"));
        students[2] = new Student("Jack", "Wu",
                new Address("8621 87 St NW", "Edmonton", "Alberta", "T6C 3H2"),
                new Address("116 St & 85 Ave", "Edmonton", "Alberta", "T6G 2R3"));
        for(Student currStudent :students){
            System.out.println(currStudent.toString() +"\n\n\n");
        }
    }

}
