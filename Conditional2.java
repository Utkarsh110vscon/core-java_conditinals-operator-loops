//use of if-else if statement.
public class Conditional2 {
    public static void main(String[]args){
        int age= 61;
        if(age>=20){
            System.out.println("you are an adult");
        }else if(age>=13&&age<=19){
            System.out.println("your are in your teen");
        }else{
            System.out.println("you are still a kid");
        }
        //use of Ternary Operator.
        int x=20; int y=20;
        int ans=(x>y)?x:y;
        System.out.print(ans);
    }
}
