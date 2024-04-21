package decemberseventh;

public class  StaticNestedTest {
    static int a=10;
    int b=20;
    public static class InnerClass{
        public void display(){
            System.out.println("hai friends i am in inner class"+a);
        }
    }
public void getData(){
        System.out.println("my object value is"+b);
    System.out.println("my object value is"+a);
}
    public static void main(String[] args) {
        StaticNestedTest.InnerClass innerClass= new StaticNestedTest.InnerClass();
        innerClass.display();
        System.out.println("hai friends i am in inner class"+a);
        StaticNestedTest staticNestedTest= new StaticNestedTest();
        staticNestedTest.getData();
    }
}
