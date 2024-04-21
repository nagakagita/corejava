package returntestbykal;

public class ReverseInteger {
    public static void main(String[] args) {
        int rev=0;
        int n=234;
        System.out.println("given number" +n);
        int result=0;
        while(n>0){
            result=n%10;
            rev=rev*10+result;
            n =n/10;
        }
        System.out.println("revers of the given no: " +rev);
    }
}
