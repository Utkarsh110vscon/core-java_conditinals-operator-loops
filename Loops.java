public class Loops {
    public static void main(String[]args){
        int n=8;
        int ans=1;
        for(int i=0; i<n; i++){
            ans*=(i+1);
        }
        System.out.println(ans);    
    }
}
