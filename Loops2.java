public class Loops2 {
    public static void main(String[]args){
        int n=672;
        int ans=0;
        int i;
        while(n>0){
            i=n%10;
            ans=ans*10+i;
            n/=10;
        }
        System.out.println(ans);
    }
}
