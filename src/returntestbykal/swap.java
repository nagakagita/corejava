package returntestbykal;

public class swap {
    public static void main(String[] args) {
        int a=20;
        int b=40;
        System.out.println("before swap avalue: "+a +"bvalue: "+b);
        //option -1
       /* b=b-a;  //20
        a=a+b;   //40
        b=a-b;   //20
        System.out.println("after swap avalue: "+a +"bvalue: "+b);*/
        //option -2:
        a=a+b; b=a-b; a=a-b;
        System.out.println("after swap avalue: "+a +"bvalue: "+b);
    }
}
