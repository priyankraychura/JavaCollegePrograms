import java.util.Scanner;

public class PR04_CurrConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rupee amount to be converted: ");
        double InRupee = sc.nextDouble();
        double UsDollar = InRupee/83.17;
        double Pound = InRupee/105.62;
        double Dirham = InRupee/22.69;

        System.out.println("Dollar Onversion: " + UsDollar);
        System.out.println("Pound Conversion: " + Pound);
        System.out.println("Dirham Conversion: " + Dirham);
    }
}
