public class halfpyramidno {
    public static void pyramid(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
