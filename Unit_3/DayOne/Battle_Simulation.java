package Unit_3.DayOne;
import java.util.Scanner;
public class Battle_Simulation {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String monster = input.nextLine();
        String unit1 = "";
        int i = 0;
        while(i == 0){
            String CurrMove = "";
            if(i + 1 > monster.length()){
                break;
            }
            if(i + 3 <= monster.length()){
                CurrMove = monster.substring(i, i + 3);
            } else{
                CurrMove = monster.substring(i, i + 1);
            }
            if(CurrMove.equals("RBL") || CurrMove.equals("RLB") || CurrMove.equals("BLR") || CurrMove.equals("BRL") || CurrMove.equals("LRB") || CurrMove.equals("LBR")){
                unit1 += "C";
                monster = monster.substring(i + 3);
            }else{
                if(CurrMove.charAt(0) == 'R'){
                    unit1 += "S";
                } else if(CurrMove.charAt(0) == 'B'){
                    unit1 += "K";
                } else{
                    unit1 += 'H';
                }
                monster = monster.substring(i + 1);
            }
        }
        System.out.println(unit1);
    }
}