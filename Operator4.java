public class Operator4 {
    public static void main(String[]args){
        int n=56; int m=75;
        int l=45; int j=73;
        boolean ans=(n<=m&&j>=l);//True
        boolean result=(n>=m||l<=j);//True
        System.out.println(ans +" "+ result);
        System.out.println(!ans);
    }
}