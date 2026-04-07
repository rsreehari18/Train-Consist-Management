import java.util.*;

public class TrainConsistUC20 {

    // Search method with defensive check
    public static boolean searchBogie(List<String> bogieIds, String key) {

        // 🔴 Fail-Fast Validation
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Train has no bogies. Search operation cannot be performed.");
        }

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Empty train case
        List<String> bogieIds = new ArrayList<>();

        try {
            boolean found = searchBogie(bogieIds, "BG101");
            System.out.println("Search Result: " + found);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}