import java.util.Scanner;

public class PR14_SumTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            double sum = num1 + num2;
            System.out.println("Sum of two number is: " + sum);

            System.out.print("Do you want to add more numbers: (yes/no)");
            String choice = sc.next().toLowerCase();

            continueLoop = choice.equals("yes");
        }while(continueLoop);

        sc.close();
    }
}
