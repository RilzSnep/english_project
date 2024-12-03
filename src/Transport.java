// Base class for transport
public abstract class Transport {
    private String modelName; // transport model name
    private int wheelsCount;  // wheels number

    // Constructor to initialize transport
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    // Method to get model name
    public String getModelName() {
        return modelName;
    }

    // Method to get number of wheels
    public int getWheelsCount() {
        return wheelsCount;
    }

    // Method for changing a tyre
    public void updateTyre() {
        System.out.println("Changing the tyre");
    }

    // Method to service all tyres
    public void serviceTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre(); // Calling update for any wheel
        }
    }

    // method for checking transport
    public abstract void check();
}
