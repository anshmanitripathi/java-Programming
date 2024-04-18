//Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.

import java.util.*;

public class b_naturtal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range 0 to : ");
        int n = sc.nextInt();
        int i = 1;
        int sumeven =0,sumodd=0;

        for(i=1;i<=n;i++){
            if(i%2==0){
                sumeven+=i;
            }else{
                sumodd+=i;
            }
        }

        
        System.out.println("Sum odd = "+ sumodd);
        System.out.println("Sum even = "+ sumeven);

    }
}