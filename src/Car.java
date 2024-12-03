// Car class, extends Transport
public class Car extends Transport {

    // Constructor for the car
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Method to check the engine
    public void checkEngine() {
        System.out.println("Checking the engine");
    }

    @Override
    public void check() {
        System.out.println("Servicing " + getModelName());
        serviceTyres(); // Servicing tyres
        checkEngine();  // Engine check
    }
}
