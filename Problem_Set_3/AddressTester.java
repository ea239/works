/*
name: Evan Zhang
Date: 2022. 11。 20
Program name: a tester for Address class
 */
package Problem_Set_3;

public class AddressTester {
    public static void main(String[] arg){
        //create a Address class and add three people's addresses in it.
        Address[] addresses = new Address[3];
        addresses[0] = new Address("30 Raymond Bartlett Ave.", "Markham", "Ontario", "L3R5H7");
        addresses[1] = new Address("73 Aldershot Crescent", "North York", "Ontario", " M2P 1M2");
        addresses[2] = new Address("8621 87 St NW", "Edmonton", "Alberta", "T6C 3H2");

        //use for loop to print them
        for(Address curAddress : addresses){
            System.out.println(curAddress.toString() + "\n");
        }
    }
}
