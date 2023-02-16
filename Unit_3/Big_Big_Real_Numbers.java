package Unit_3;

import javax.script.*;
import java.lang.Math;
import java.util.Scanner;

public class Big_Big_Real_Numbers {
    public static ScriptEngineManager mgr = new ScriptEngineManager();
    public static ScriptEngine engine = mgr.getEngineByName("JavaScript");

    public static void main(String[] arg) throws ScriptException {
        Scanner input = new Scanner(System.in);
        String strLength = input.nextLine();
        int length = Integer.parseInt(strLength);
        String[] equations = new String[length];
        for(int i = 0; i < length; i++){
            equations[i] = input.nextLine();
            equations[i].replace(' ', '+');
        }

        String answer = "0";
        for(int i = 0; i < length; i++){
            try {
                answer = String.valueOf(engine.eval(equations[i].toString()));
            } catch (ScriptException ex) {
                answer = "Math Error";
            }
            System.out.println(answer);
        }


    }
}
