public class flyds_tringle {
    public static void tringle(int n){
        int counter=10;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tringle(5);
    }
}
