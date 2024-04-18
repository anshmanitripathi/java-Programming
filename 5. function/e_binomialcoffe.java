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

        System.out.print("Enter the value of 'n' :");
        int n = sc.nextInt();
        System.out.print("Enter the value of 'r' :");
        int r = sc.nextInt();

        int nfact = factfunction(n);
        int rfact = factfunction(r);
        int dfact = factfunction(n-r);  // d = (n-r)!

        int binomialcoff = nfact/(rfact * dfact);
        System.out.println( "binomialcoff = " + binomialcoff);

   
    }
}