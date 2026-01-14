package pack1;

public class lab10 {

    public static boolean isPositiveString(String str) {
        // Convert to uppercase to handle lower/upper mix
        str = str.toUpperCase();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;  // Not in alphabetical order
            }
        }
        return true;  // All characters in correct order
    }

    public static void main(String[] args) {
        System.out.println(isPositiveString("ANT"));   // true
        System.out.println(isPositiveString("CAT"));   // false
        System.out.println(isPositiveString("AART"));  // true
    }
}
