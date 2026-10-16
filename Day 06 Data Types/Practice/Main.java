public class Main {
    public static void main(String[] args) {
        String original = "hello";
        String reversed = ""; // Start with an empty text box
        
        // Loop backward: start at the last character index, end at 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i); // Add each letter one by one
        }
        
        System.out.println(reversed); // Output: olleh
    }
}
