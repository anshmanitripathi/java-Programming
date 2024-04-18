
import java.util.*;

public class k_factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range 0 to : ");
        int n = sc.nextInt();
        int i = 1;
        int fact=1;

        for(i=1;i<=n;i++){
            fact*=i;
        }

        
        System.out.println("factorial ="+ fact);

    }
}