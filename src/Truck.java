// Truck class extends Transport
public class Truck extends Transport {

    // Constructor for truck
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    // Method to check engine
    public void checkEngine() {
        System.out.println("Checking the engine");
    }

    // Method to check trailer
    public void checkTrailer() {
        System.out.println("Checking the trailer");
    }

    @Override
    public void check() {
        System.out.println("Servicing " + getModelName());
        serviceTyres(); // Servicing tyres
        checkEngine();  // Engine check
        checkTrailer(); // Trailer check
    }
}
