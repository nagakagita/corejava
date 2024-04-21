package returntestbykal;

public class RecursionByTest {
    public static void main(String[] args) {
        printWithoutLoop(10);
    }

    private static void printWithoutLoop(int n) {
        if(n>=1){
            System.out.println(11-n);
            printWithoutLoop(n-1);
        }

    }
}
