import com.infinitevalue.mypi.*;
import com.infinitevalue.mypi.util.*;

public class PR40_Package {
    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.main(null);

        String reverseString = StringUtil.reverse("Hello world");
        System.out.println(reverseString);
    }
}
