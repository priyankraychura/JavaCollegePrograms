import java.util.Date;

public class PR28_DateClass {
    public static void main(String[] args) {
        Date now = new Date();

        int year = now.getYear();
        int month = now.getMonth();
        int day = now.getDay();
        int hour = now.getHours();
        int minute = now.getMinutes();
        int second = now.getSeconds();

        System.out.println("The current data and time is: " + year + "-" + month + "-" + day + "-" + hour + ":" + minute + ":" + second);
        System.out.println(now);
    }
}
