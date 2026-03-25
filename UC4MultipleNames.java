public class UC4MultipleNames {
    public static void main(String[] args) {
        // Check if the array has any arguments
        if (args.length > 0) {
            // Loop through the array and greet each name
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        } else {
            // Default fallback if the array is empty
            System.out.println("Hello, World!");
        }
    }
}