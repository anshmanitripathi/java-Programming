
import java.util.*;

public class b_invertedstar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line=1;
        int star = 1;

        for(line=1;line <= 5 ; line++){
            for(star=5; star >= line; star--){

                System.out.print("* ");
            }
           System.out.print("\n");
        }
        

    }
}