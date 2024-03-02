import java.util.Scanner;

public class PR05_Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to make calculations: ");
        int num = sc.nextInt();

        double Square = num * num;
        double Qube = num * num * num;
        double SqRoot = Sqrt(num);
        double Fact = Factorial(num);

        System.out.println("Square of the number: " + Square);
        System.out.println("Qube of the number: " + Qube);
        System.out.println("Square Root of the number: " + SqRoot);
        System.out.println("Factorial of the number: " + Fact);
    }

    public static double Sqrt(int num){
        double temp;
        double sqrtRoot = (double) num /2;

        do{
            temp = sqrtRoot;
            sqrtRoot = (temp+(num/temp))/2;
        }while(temp-sqrtRoot!=0);

        return sqrtRoot;
    }

    public static double Factorial(int num){
        int fact = 1;
        for(int i=num; i>1; i--){
            fact = fact * i;
        }

        return fact;
    }


}
