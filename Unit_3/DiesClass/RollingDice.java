package Unit_3.DiesClass;

public class RollingDice {
    public static void main(String[] arg){
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        Die die1 = new Die(num1);
        Die die2 = new Die(num2);
        PairOfDice twoDice = new PairOfDice(die1, die2);
        System.out.println(twoDice.value());
    }

}
