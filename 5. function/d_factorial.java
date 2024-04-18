import java.util.*;
public class d_factorial{ 

    public static int factfunction(int num){
        int fact = 1; 
        for(int i=1; i<=num ; i++){
            fact = fact * i;
        }
        return fact;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");

        int num = sc.nextInt();
        int fact = factfunction(num);
        System.out.println( "fact = " + fact);

   
    }
}