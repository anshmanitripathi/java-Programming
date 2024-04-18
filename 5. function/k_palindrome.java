import java.util.*;

public class k_palindrome{

    public static boolean palindrome(int num){
        boolean palindrome = true;
        int sum = 0;
        int a = num;

        while(num!=0){
            int r = num%10;
            sum = (sum * 10) + r;
            num = num/10;
        }

        if(a!=sum){
            palindrome = false;
        }

        return palindrome;


    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = sc.nextInt();

        boolean ispal = palindrome(num);

        if(ispal==true){
            System.out.println("Palindrome number");
        } else{
            System.out.println("Not a palindrome number");
        }

    }

}