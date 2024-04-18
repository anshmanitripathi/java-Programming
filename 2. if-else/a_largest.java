import java.util.*;

public class a_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the first number : ");
        int b  = sc.nextInt();

        System.out.println("Enter the first number : ");
        int c = sc.nextInt();

        if( a > b && a>c){
            System.out.println(a + " is the lagest.");
        }
        if( b >=c){
            System.out.println(b + "is the lagest.");
        }
        if(a == b && b == c){
            System.out.println("All numbers are equal.");
        }
        else{
            System.out.println(c + "is the lagest.");
        }
        


    }
}