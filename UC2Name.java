public class UC2Name {
    public static void main(String[] args) {
        // Check if a command-line argument was provided
        if (args.length > 0) {
            // Join all arguments in case of a full name (e.g., "Kunal Thakur")
            String name = String.join(" ", args);
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback if no name is provided
            System.out.println("Hello World!");
        }
    }
}