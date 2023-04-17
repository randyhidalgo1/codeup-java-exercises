package Vehicle;
public class CarLot {

    public static void main (String [] args) {
        vehicle[] vehicles = new vehicle[2];
        vehicles[0] = new Car();
        vehicles[0].setName("Maserati");
        vehicles[1] = new Trucks();
        vehicles[1].setName("Tundra");
//        vehicles[2] = new Boat();
//        vehicles[2].setName("El Dedo");

        for (vehicle vehicle : vehicles) {
                vehicle.getMakeNoise();
            }

    }
}
