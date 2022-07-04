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
        } else {
            System.out.println(b+" is greater then "+a);
        }

        System.out.println("Enter current time");
        float time = numberForCompare.nextFloat();
        if(12>time){
            System.out.println("It's morning");
        }else{
            System.out.println("It's is more than 12");
        }
    }
}
