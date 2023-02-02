// java source code for usage of conditionaland loops.
import java.util.Scanner;
public class Conditional{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                if(i%5==0){
                    System.out.println("BuzzFizz");
                }else{
                    System.out.println("Buzz");
                }
            }
            else{
                if(i%5==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
               
            }
        }
        scan.close();
    }
}
