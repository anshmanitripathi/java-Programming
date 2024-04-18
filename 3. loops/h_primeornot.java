import java.util.*;

public class b_naturtal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 0;
        int fact =0;

        for(i=1;i<=n;i++){
            if(n%i==0){
               fact+=1;
            }
        }

        if(fact==2){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("not a prime number.");   
        }

    }
}