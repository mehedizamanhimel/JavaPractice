import java.util.Stack;

public class StackOperations {

    public void StackOne(){
        Stack<Integer> stack = new Stack<>();
        int i=4;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("The initial stack is: "+stack);
        if(stack.peek()==i){
            System.out.println("The stack is good");
        }
        else {
            System.out.println("The stack is bad");
        }
    }
}
