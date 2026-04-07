import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistUC12 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> 
                    !b.type.equals("Cylindrical") || 
                    b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT");
        } else {
            System.out.println("\nTrain is NOT SAFE");
        }
    }
}