import java.util.*;
public class c_product{ 

    public static int productfunction(int a, int b){
        int product = a * b;
        return product;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = productfunction(a,b);
        System.out.println("product = " + product);

   
    }
}