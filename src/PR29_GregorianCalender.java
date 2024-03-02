import java.util.Calendar;
import java.util.GregorianCalendar;

public class PR29_GregorianCalender {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("Today is " + year + "-" + (month+1) + "-" + dayOfMonth);
    }
}
