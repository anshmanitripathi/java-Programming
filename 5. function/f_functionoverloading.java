import java.util.*;
public class f_functionoverloading{ 

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int sum(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        int sum2 = sum(a,b);
        int sum3 = sum(a,b,c);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3);

   
    }
}