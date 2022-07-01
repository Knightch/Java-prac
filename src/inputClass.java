import java.util.Scanner;
public class inputClass {
    public static void main(String[] args) {
        System.out.println("Taking Input from user");
        Scanner newInput = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num1 = newInput.nextInt();
        System.out.println("Enter a decimal number");
        float num1 = newInput.nextFloat();
//        System.out.println("Enter a another number");
        System.out.println("Enter a another decimal number");
//        int num2 = newInput.nextInt();
        float num2 = newInput.nextFloat();
//        int sum = num1 + num2 ;
        float sum = num1 + num2;
//        System.out.println("Sum of given number is "+ sum);
        System.out.println("Sum of given decimal number is "+ sum);
    }
}
