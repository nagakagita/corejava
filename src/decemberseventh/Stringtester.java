package decemberseventh;

public class Stringtester {
    public static void main(String[] args) {
        String s1="code";
        String s2="code";
        String s3= new String("code");
        String s4= new String("code");
        //System.out.println("hai");
        System.out.println(""+(s1==s2));
        System.out.println(s3==s4);
        System.out.println("s1.equals(s2)===" +s1.equals(s2));
        System.out.println("s3.equals(s4)===" +s3.equals(s4));
    }
}
