package CCC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bridge_Crossing {



    public static void main(String[] arg) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\zzh33\\IdeaProjects\\School work\\src\\CCC\\Bridge_Crossing_Data"));

        ArrayList<String> data = new ArrayList<>();
        while(input.hasNext()){
            data.add(input.nextLine());
        }

        int numPerTime = Integer.parseInt(data.get(0));
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> times = new ArrayList<>();
        for(int i = 2; i < (2 + Integer.parseInt(data.get(1))); i += 2){
            names.add(data.get(i));
            times.add(Integer.parseInt(data.get(i + 1)));
        }
/*
        ArrayList<Integer> timeSort = Collections.sort(times);
        while(timeSort != times){
            for(int i = 1; i < times.size(); i++){
                if(times.get(i) < times.get(i-1)){
                    times.set(i-1, times.remove(i));
                    names.set(i-1, names.remove(i));
                }
            }
        }

        System.out.println(names);
        System.out.println(times);


 */

    }
}
