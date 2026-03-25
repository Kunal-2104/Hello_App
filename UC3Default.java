public class UC3Default {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default handling if no name is provided
            System.out.println("Hello World");
        }
    }
}