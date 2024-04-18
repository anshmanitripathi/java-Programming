import java.util.*;

public class e_circlearea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        float r = sc.nextFloat();

        float area = r * r * 3.14f;

        System.out.print("Area of circle : ");
        System.out.print(area);
    }
}