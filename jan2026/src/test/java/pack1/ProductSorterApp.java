package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ProductSorterApp {

    // ===== Option A: Basic alphabetical sort (case-sensitive) =====
    public static void main(String[] args) {
        List<String> products = new ArrayList<>(
                Arrays.asList("Mouse", "keyboard", "Monitor", "USB Cable", "Adapter", "charger", "mouse")
        );

        // Sort (case-sensitive): 'Adapter' < 'Monitor' < 'Mouse' < 'USB Cable' < 'charger' < 'keyboard' < 'mouse'
        Collections.sort(products);

        System.out.println("=== Sorted product names (basic, case-sensitive) ===");
        for (String name : products) {
            System.out.println(name);
        }

        // --- If you prefer the enhanced version, comment out everything above main()
        // and call enhanced(); like this:
        // enhanced();
    }

    // ===== Option B: Enhanced — case-insensitive sort + de-duplicate =====
    public static void enhanced() {
        List<String> products = new ArrayList<>(
                Arrays.asList("Mouse", "keyboard", "Monitor", "USB Cable", "Adapter", "charger", "mouse", "Keyboard")
        );

        // Remove duplicates while preserving first occurrence (case-insensitive)
        // Strategy: track lower-cased seen values using a LinkedHashSet
        LinkedHashSet<String> seenLower = new LinkedHashSet<>();
        List<String> deduped = new ArrayList<>();
        for (String p : products) {
            String key = p.toLowerCase();
            if (!seenLower.contains(key)) {
                seenLower.add(key);
                deduped.add(p);
            }
        }

        // Case-insensitive sort (stable order for equal strings)
        deduped.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("=== Sorted product names (enhanced, case-insensitive, unique) ===");
        for (String name : deduped) {
            System.out.println(name);
        }
    }
}