import java.util.*;

public class j_bintodec{

    public static int dectobin(int num){

        int sum=0, r=0, p=0;

        while(num!=0){
            r = num % 2;
            sum = sum + ( r * (int)Math.pow(10,p));
            num = num/2;
            p++;
        }

        return sum;
            

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.print(dectobin(num));
    }




}