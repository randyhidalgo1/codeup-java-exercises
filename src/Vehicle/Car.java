package Vehicle;

public class Car extends vehicle {

    public void makeNoise() {
        System.out.println(this.getName() +  " goes Vroom, Vroom");
    }
    public void breakingDownNoise(){
        System.out.println("BRRR Kaputttt");
    }
    public Car() {
        System.out.println("New Car created!");
    }
}
