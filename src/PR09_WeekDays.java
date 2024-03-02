import java.util.Scanner;

public class PR09_WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to select a day of the week: ");
        int num = sc.nextInt();;

        switch (num){
            case 1 -> System.out.println("Today is Sunday");
            case 2 -> System.out.println("Today is Monday");
            case 3 -> System.out.println("Today is Tuesday");
            case 4 -> System.out.println("Today is Wednesday");
            case 5 -> System.out.println("Today is Thursday");
            case 6 -> System.out.println("Today is Friday");
            case 7 -> System.out.println("Today is Saturday");
            default -> System.out.println("Invalid Input");
        }
    }
}
