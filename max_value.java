public class max_value {
    public static int max_valuee(int number[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(max<number[i]){
                max=number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int number[]={7,5,6,4,9,10};
        System.out.println(max_valuee(number));
    }
}
