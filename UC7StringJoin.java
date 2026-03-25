public class UC7StringJoin {
    public static void main(String[] args) {
        if (args.length > 0) {
            // One line to rule them all. No loops, no manual trimming.
            String allNames = String.join(", ", args);
            System.out.println("Hello, " + allNames + "!");
        } else {
            // Default fallback
            System.out.println("Hello, World!");
        }
    }
}