import java.util.StringTokenizer;

public class PR30_StringTokenizer {
    public static void main(String[] args) {
        String str = "This is a test String";

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
