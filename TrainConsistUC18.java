public class TrainConsistUC18 {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie ID array
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println("\nBogie ID " + searchKey + " found in the train.");
        } else {
            System.out.println("\nBogie ID " + searchKey + " NOT found.");
        }
    }
}
