public class UC2Name {
    public static void main(String[] args) {
        // UC2: Take name from command-line argument
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}