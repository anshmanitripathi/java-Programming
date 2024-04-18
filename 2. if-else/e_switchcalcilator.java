import java.util.*;

public class a_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int out = 0;

        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the operator : ");
        char ch = sc.next().charAt(0);

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        switch (ch){
            case '+':{ out = a + b;
                        break;
            }
            case '-':{ out = a - b;
                        break;
            }
            case '*':{ out = a * b;
                        break;
            }
            case '/':{ out = a / b;
                        break;
            }  
            default :{ System.out.println("Wrong Operator");
                        break;
            }  
        }

    System.out.println(out);

    }
}