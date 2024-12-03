// Main class to run program
public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();


        Car car = new Car("carFirst", 4);// Creating first cars
        Car car2 = new Car("carSecond", 4);// Creating second cars


        Truck truck = new Truck("truckFirst", 6);// Creating first trucks
        Truck truck2 = new Truck("truckSecond", 8);// Creating second trucks


        Bicycle bicycle = new Bicycle("bicycleFirst", 2); // Creating first bicycles
        Bicycle bicycle2 = new Bicycle("bicycleSecond", 2); // Creating second bicycles

        // Checking all transports
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
    }
}
