package Unit_3;

public class CarTest {
    public static void main(String[] arg){
        Car[] cars = new Car[3];
        cars[0] = new Car("BMW", "M3", 2022);
        cars[1] = new Car("Mercedes-Benz", "C-Class", 2014);
        cars[2] = new Car("Tesla", "X", 2016);
        for(Car newCar : cars){
            System.out.println(newCar.toString());
        }
    }
}
