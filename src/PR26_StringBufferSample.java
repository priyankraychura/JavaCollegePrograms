public class PR26_StringBufferSample {
    public static void main(String[] args) {
        // StringBuffer creation
        StringBuffer stringBuffer = new StringBuffer("This is a string buffer.");

        // Append string
        stringBuffer.append(" This is an appended string.");

        // Insert string at index
        stringBuffer.insert(0, "This is an inserted string. ");

        // Replace substring
        stringBuffer.replace(0, 15, "This is a replaced string. ");

        // Delete substring
        stringBuffer.delete(0, 15);

        // Reverse string buffer
        stringBuffer.reverse();

        // Convert string buffer to string
        String string = stringBuffer.toString();

        // Print string
        System.out.println(string);
    }
}
