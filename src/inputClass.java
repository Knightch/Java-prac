import java.util.Scanner;
public class inputClass {
    public static void main(String[] args) {
        System.out.println("Taking Input from user");
        Scanner newInput = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num1 = newInput.nextInt();
        System.out.println("Enter a another number");
        int num2 = newInput.nextInt();
        int sum = num1 + num2 ;
        System.out.println("Sum of given number is "+ sum);
    }
}
