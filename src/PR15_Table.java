import java.util.Scanner;

public class PR15_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Num = sc.nextInt();
        System.out.print("Enter the number upto: ");
        int upTo = sc.nextInt();

        for(int i=1; i<=upTo; i++){
            System.out.println(Num + " * " + i + " = " + Num*i);
        }
    }
}
