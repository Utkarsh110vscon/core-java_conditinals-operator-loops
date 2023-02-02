import java.util.Scanner;
public class Operator2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.print((num1==num2)?(1):(0));
        scan.close();
    }
}
