public class halfpyramid {
    public static void piramid(int row,int col){
        for(int i=1;i<=row;i++){
            for (int j=1;j<=col-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        piramid(4, 4);
    }
    
}
