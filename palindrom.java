

public class palindrom {
    public static int ispallindrm(int n){
        int lastdigit=0;
        int sum=0;
        lastdigit=n%2;
        sum=sum+(lastdigit*10);
        n=n/2;
        return sum;
    }
    public static void main(String args[]) {
        int n=132;
        System.out.println(ispallindrm(n));
    }
}
