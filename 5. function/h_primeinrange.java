/*import java.util.*;

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

        System.out.print("Enter the range 1 to ");
        int n = sc.nextInt();

        for(int i=2 ; i<= n ; i++){
                boolean is_prime = isprime(i);
                    if(is_prime == true){
                        System.out.print(i + " ");
                    }
        }  
        }
}
*/


import java.util.*;
public class h_primeinrange{




public static boolean is_prime(int num){
    boolean is_prime = true;
    if(num==2){
        is_prime = true;
    }

    for(int i=2; i<=Math.sqrt(num); i++){
        if(num%i==0){
            is_prime = false; 
        } 
    }

    return is_prime;

}



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range 1 to ");
        int n = sc.nextInt();
        for(int i=2; i<= n; i++){
            boolean t = is_prime(i);
            if(t==true){
                System.out.print(" "+ i);
            }


        }

    }
} 