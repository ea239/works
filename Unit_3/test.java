package Unit_3;

public class test {
    public static void main(String[] arg){
        double a = 3;
        double b = 4;
        double c = -3;
        double ans1 = 0;
        double ans2 = 0;
        double delta = b * b - 4 * a * c;

        if(delta >= 0){
            ans1 = (0 - b + Math.sqrt(delta))/ (2 * a);
            ans2 = (0 - b - Math.sqrt(delta))/ (2 * a);
        }
        if(ans1 == ans2){
            System.out.println(ans1);
        }else{
            System.out.println(ans1 + "\n" + ans2);
        }

        double d1 = 10.0;

        Double d2 = 20.0;

        Double d3 = new Double(30.0);

        double d4 = new Double(40.0);

        System.out.println(d1 + d2 + d3.doubleValue() + d4);
    }
}
