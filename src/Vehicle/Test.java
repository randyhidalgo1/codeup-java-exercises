package Vehicle;

public class Test {

    public static void main (String[] args) {
        Car car = new Car();
        car.setName("Maserati");
        car.breakingDownNoise();
        Trucks trucks = new Trucks();
        trucks.setName("Tundra");
        trucks.makeNoise();

    }
}
