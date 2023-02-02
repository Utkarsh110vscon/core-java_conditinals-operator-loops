
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1=scan.nextInt();
        System.out.println("Enter the operator: ");
        char symbol=scan.next().charAt(0);
        System.out.println("Enter the number: ");
        int num2=scan.nextInt();
        switch(symbol){
            case '+': System.out.println(num1+num2);
            break;
            case '-': System.out.println(num1-num2);
            break;
            case '*': System.out.println(num1*num2);
            break;
            case '/': System.out.println(num1/num2);
            break;
            case '%': System.out.println(num1%num2);
            break;
            default: System.out.println("Invalid,operator ERROR!");
            break;
        }
        scan.close();
    }
}
