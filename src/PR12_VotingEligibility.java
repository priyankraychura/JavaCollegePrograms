import java.util.Scanner;

public class PR12_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("Mr. " + name + " your age is " + (18 - age) + " less to vote.");
        }else{
            System.out.println("Mr. " + name + " you're eligible for voting.");
        }
    }
}
