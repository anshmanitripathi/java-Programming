
import java.util.*;

public class c_patternnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line=1;
        int num = 1;

        for(line=1;line <= 5; line++){
            for(num=1; num <=line; num++){

                System.out.print(num);
            }
           System.out.print("\n");
        }
        

    }
}