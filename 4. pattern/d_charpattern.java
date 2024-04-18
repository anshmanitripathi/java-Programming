
import java.util.*;

public class d_charpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line=1;
        int num = 1;
        char ch = 'A';

        for(line=1;line <= 5; line++){
            for(num=1; num <=line; num++){

                System.out.print(ch);
                ch++;
            }
           System.out.print("\n");
        }
        

    }
}