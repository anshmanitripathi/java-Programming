import java.util.*;
public class b_sumfunction{ 

    public static int sumfunction(int a, int b){
        int sum = a + b;
        return sum;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumfunction(a,b);
        System.out.println("Sum = " + sum);

   
    }
}