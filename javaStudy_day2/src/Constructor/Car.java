package Constructor;

public class Car{
    String name;
    int number;
    public static int carCount;

    public Car(String n){
        name = n;
        carCount++;
    }
}