// Bicycle class extends Transport
public class Bicycle extends Transport {

    // Constructor for bicycle
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Servicing " + getModelName());
        serviceTyres();
    }
}
