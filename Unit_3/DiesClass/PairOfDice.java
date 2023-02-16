package Unit_3.DiesClass;

public class PairOfDice {
    private Die die1;
    private Die die2;
    public PairOfDice(Die die1, Die die2){
        this.die1 = die1;
        this.die2 = die2;
    }

    public int value(){
        return die1.getNumber() + die2.getNumber();
    }

}
