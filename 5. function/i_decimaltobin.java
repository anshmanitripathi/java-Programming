import java.util.*;

public class i_decimaltobin{

    public static int bintodec(int num){

        int sum=0, r=0, p=0;

        while(num!=0){
            r = num % 10;
            sum = sum + ( r * (int)Math.pow(2,p));
            num = num/10;
            p++;
        }

        return sum;
            

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.print(bintodec(num));
    }




}