public class DSA {
    public static void doublingLoopVariable(int n){
        for(int i = 1; i<n;){
            System.out.println("Value of i is:"+i);
            i = i * 2;
        }
    }
    public static  void main(String[] args){
        doublingLoopVariable(100000000);
    }
}
