public class UC6Substring {
    public static void main(String[] args) {
        if (args.length > 0) {
            String allNames = "";
            
            // Enhanced for-loop building the string with a trailing delimiter
            for (String name : args) {
                allNames += name + ", ";
            }
            
            // The concept: Substring chops off the final ", " (last 2 characters)
            allNames = allNames.substring(0, allNames.length() - 2);
            
            System.out.println("Hello, " + allNames + "!");
        } else {
            // Default fallback
            System.out.println("Hello, World!");
        }
    }
}