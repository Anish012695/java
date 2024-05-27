public class cunstroctor{
    int a; String name;
    cunstroctor(){
        a=120; name="anish mukahrjee";
    }
    void show(){
        System.out.println(a+" "+name );
    }
}
class b{
    public static void main(String[] args) {
        cunstroctor a=new cunstroctor();
        a.show();
    }
}

