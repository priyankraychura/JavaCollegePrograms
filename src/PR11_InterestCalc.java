import java.util.Scanner;

public class PR11_InterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Select number according to requirement: ");
        int choice = sc.nextInt();

        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter number of years: ");
        double n = sc.nextDouble();

        if(choice==1){
            double si;
            si = (p*r*n)/100;
            System.out.println("Simple interest amount is: " + si);
        }else{
            double ci;
            ci = p * ((Math.pow(1 + r/100, n)) - 1);
            System.out.println("Compound Interest amount is: " + ci);
        }
    }
}
