package Unit_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ACM_Contest_Scoring {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int score = 0;
        ArrayList<String> lines = new ArrayList<>();
        boolean cons = true;
        while(cons){
            String teams = input.nextLine();
            if(teams.equalsIgnoreCase("-1")){
                cons = false;
            }else{
                lines.add(teams);
            }
        }

        ArrayList<Integer> right = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            if(lines.get(i).substring(lines.get(i).length() - 5) .equalsIgnoreCase("right")){
                right.add(i);
            }
        }

        for(int i = 0; i < right.size(); i++){
            int space = lines.get(right.get(i)).indexOf(" ");
            int time = Integer.parseInt(lines.get(right.get(i)).substring(0, space));
            score += time;
        }

        for(int i = 0; i < right.size(); i++){
            String line = lines.get(right.get(i));
            int space = line.indexOf(" ");
            line = line.substring(space + 1);
            space = line.indexOf(" ");
            String letter = line.substring(0,space);
            int times = 0;

            for(int j = 0; j < lines.size(); j++){
                if(lines.get(j).indexOf(letter) != -1){
                    times++;
                }
            }

            score += ((times - 1) * 20);
        }

        System.out.println(score);
    }
}
