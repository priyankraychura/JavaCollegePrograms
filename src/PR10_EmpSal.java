import java.util.Scanner;

public class PR10_EmpSal {
    public static void main(String[] args) {
        System.out.println("Employee salary calculation: ");

        float TA, DA, HRA;
        float totalSal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String eName = sc.next();
        System.out.print("Enter base salary: ");
        int sal = sc.nextInt();
        System.out.print("Is employee permanent? (y/n)");
        String isPermanent = sc.next();

        switch (isPermanent){
            case "y" ->{
                TA = (sal * .20f);
                DA = (sal * .30f);
                HRA = (sal * .15f);
            }

            case "n" ->{
                TA = (sal * .10f);
                DA = (sal * .15f);
                HRA = 0;
            }
            default -> throw new IllegalStateException("Unexpected value: " + isPermanent);
        }

        totalSal = sal + TA + DA + HRA;

        System.out.println(TA);
        System.out.println(DA);
        System.out.println(HRA);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Basic Salary: " + sal);
        System.out.println("Employee Total Salary: " + totalSal);
    }
}
