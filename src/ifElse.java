import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        if(30>18){
            System.out.println("30 is greater than 18");
        }
        Scanner numberForCompare = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = numberForCompare.nextInt();
        System.out.println("Enter another number");
        int b = numberForCompare.nextInt();
        if(a > b){
            System.out.println(a+" is greater then "+b);
        }
    }
}
