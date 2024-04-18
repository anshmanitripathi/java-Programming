import java.util.*;

public class f_gst{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pen");
        float price_pen = sc.nextFloat();
        System.out.println("Enter the price of pencil");
        float price_pencil = sc.nextFloat();
        System.out.println("Enter the price of rubber");
        float price_rubber = sc.nextFloat();

        float total_price = price_pen + price_rubber + price_pencil;
        float total = total_price + (total_price * 0.18f);

        System.out.println(total);
    }
}