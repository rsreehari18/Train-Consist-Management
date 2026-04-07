import java.util.Arrays;

public class TrainConsistUC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } 
            else if (comparison < 0) {
                high = mid - 1; // Search left
            } 
            else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted bogie IDs (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309";

        System.out.println("\nBogie IDs: " + Arrays.toString(bogieIds));

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }
    }
}