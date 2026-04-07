// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;   // Petroleum / Coal / Grain

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    void assignCargo(String cargoType) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // Valid assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType + " → " + shape);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

public class TrainConsistUC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // Another safe case
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}