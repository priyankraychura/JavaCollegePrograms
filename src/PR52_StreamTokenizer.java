import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class PR52_StreamTokenizer {
    public static void main(String[] args) throws IOException {
        String text = "This is a sentence with 123 numbers and symbols, like $ and +.";

        Reader reader = new StringReader(text);

        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        tokenizer.ordinaryChar('$');

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF){
            switch (tokenizer.ttype){
                case StreamTokenizer.TT_WORD ->
                    System.out.println("Word: " + tokenizer.sval);

                case StreamTokenizer.TT_NUMBER ->
                    System.out.println("Number: " + tokenizer.nval);

                case '$' ->
                    System.out.println("Symbol: $");

                default -> System.out.println("Other: " + (char)tokenizer.ttype);
            }
        }
        reader.close();
    }
}
