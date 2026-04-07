import java.util.Arrays;

public class TrainConsistUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie type names
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        // Before sorting
        System.out.println("\nBefore Sorting: " + Arrays.toString(bogieNames));

        // Built-in sorting
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("After Sorting:  " + Arrays.toString(bogieNames));
    }
}