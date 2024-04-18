import java.util.*;

public class g_isprime{

    public static boolean isprime(int num){

        boolean isprime = true;
        if(num==2){
            isprime = true;
        }else{
            for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)
                isprime = false;
        }
        }
        

        return isprime;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        boolean is_prime = isprime(num);
        if(is_prime == true){
            System.out.print("Prime number");
        }else if(is_prime == false){
            System.out.print("Not a Prime number");
        }    

        }

}
