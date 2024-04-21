package returntestbykal;

import java.util.Stack;

public class ExpressionTest {
    public static void main(String[] args) {
         String expression ="{a+(a-b)}";
         boolean isValied = testExpression(expression);
    }

    private static boolean testExpression(String expression) {
        Stack operandStack=new Stack<>();
        Stack elementStack = new Stack<>();
        char[] expcharArray = expression.toCharArray();
        for(int i=0;i<expcharArray.length;i++){
            if(expcharArray[i]=='{' || expcharArray[i]=='[' || expcharArray[i]=='('){
                operandStack.push(expcharArray[i]);
            }else if(expcharArray[i]=='}' ){

            }
        }
        return true;
    }
}
