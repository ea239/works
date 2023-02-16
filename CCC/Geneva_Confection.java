package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class Geneva_Confection {

    public static boolean check(ArrayList<Integer> cars){
        ArrayList<Integer> branch = new ArrayList<>();
        ArrayList<Integer> lake = new ArrayList<>();

        while(cars.size() != 0){
            if(lake.size() == 0){
                if(cars.get(cars.size() - 1) != 1){
                    branch.add(cars.remove(cars.size()-1));
                }
                else{
                    lake.add(cars.remove(cars.size()-1));
                }
            }
            else{
                if(cars.get(cars.size()-1) == (lake.get(lake.size()-1) + 1)){
                    lake.add(cars.remove(cars.size()-1));
                }else if(branch.size() != 0){
                    if(branch.get(branch.size() - 1) == lake.get(lake.size()-1) + 1){
                        lake.add(branch.remove(branch.size() - 1));
                    }
                }
                else{
                    branch.add(cars.remove(cars.size() -1));
                }
            }
        }

        if(branch.size() != 0){
            int times = branch.size() - 1;
            for(int r = 0; r < times; r++){
                if(!(branch.get(branch.size()-1) == (lake.get(lake.size() - 1) + 1))){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        char[] output = new char[tests];

        for(int i = 0; i < tests; i++){
            int numCar = input.nextInt();
            ArrayList<Integer> cars = new ArrayList<>();
            for(int r = 0; r < numCar; r++){
                cars.add(input.nextInt());
            }
            if(check(cars)){
                output[i] = 'Y';
            }else{
                output[i] = 'N';
            }
        }

        for(char curr : output){
            System.out.println(curr);
        }
    }
}
