import java.util.*;

public class b_naturtal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = sc.nextInt();
        int i = 0, sum=0;

        while(i<=n){
            sum+=i;
            i++;
        }

        System.out.println(sum);

    }
}