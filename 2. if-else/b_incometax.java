import java.util.*;

public class a_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the your income : ");
        float income = sc.nextInt();
        float tax =0;

        if( income <= 500000){
            tax = 0;
        }
        else if( income > 500000 && income <= 1000000){
            tax = (income * 0.2f);
        }
        else if( income > 1000000){
            tax = (income * 0.3f);
        }

        System.out.println("tax = " + tax );

    }
}