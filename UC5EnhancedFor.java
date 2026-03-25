public class UC5EnhancedFor {
    public static void main(String[] args) {
        // UC5 Requirement: Must use enhanced for-loop
        if (args.length > 0) {
            for (String currentName : args) {
                System.out.println("Hello, " + currentName + "!");
            }
        } else {
            System.out.println("Hello, World!");
        }
    }
}