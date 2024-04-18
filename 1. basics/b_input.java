import java.util.*;

public class b_input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter a int number");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("Enter a boolean");
        boolean decision = sc.nextBoolean();
        System.out.println(decision);

        System.out.println("Enter a float number");
        Float price = sc.nextFloat();
        System.out.println(price);


    }
}