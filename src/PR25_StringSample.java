public class PR25_StringSample {
    public static void main(String[] args) {
        // String creation
        String string = "This is a string.";

        // String length
        int length = string.length();
        System.out.println("String length: " + length);

        // Get character at index
        char character = string.charAt(0);
        System.out.println("Character at index 0: " + character);

        // Check if string contains substring
        boolean contains = string.contains("string");
        System.out.println("Does the string contain the substring \"string\"? " + contains);

        // Split string into array of strings
        String[] words = string.split(" ");

        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // Replace substring
        String replacedString = string.replace("string", "replaced");
        System.out.println("String with replaced substring: " + replacedString);

        // Substring
        String substring = string.substring(10);
        System.out.println("Substring from index 10: " + substring);

        // To lower case
        String lowercaseString = string.toLowerCase();
        System.out.println("String in lowercase: " + lowercaseString);

        // To upper case
        String uppercaseString = string.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseString);

        // Trim whitespace
        String trimmedString = string.trim();
        System.out.println("String with whitespace trimmed: " + trimmedString);
    }
}
