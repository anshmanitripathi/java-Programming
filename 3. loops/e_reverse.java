import java.util.*;

public class b_naturtal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int rev = 0;

        while(n!=0){
            int r = n%10;
            rev = (rev * 10) + r;
            n = n/10;
        }

        System.out.println(rev);

    }
}