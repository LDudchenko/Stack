public class StackArray {
    private int size;
    private int top;
    private int[] stack;
    int product;

    public StackArray(int s){
        size = s;
        top = -1;
        stack = new int[size];
        product=1;
    }

    public StackArray(){
        size = 10;
        top = -1;
        stack = new int[size];
        product=1;
    }

    public int pop() throws StackException{
        if(top==-1){
            throw new StackException("Stack is empty!");
        }
        if(stack[top]<5&&stack[top]!=0){
            product/=stack[top];
        }
        return stack[top--];
    }

    public void push(int value) throws StackException{
        if(top == size-1){
            throw new StackException("Stack is full!");
        }
        if(value<5&&value!=0){
            product*=value;
        }
        top++;
        stack[top] = value;
    }
    public int peek() throws StackException{
        if(top == -1){
            throw new StackException("Stack is empty!");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==size-1);
    }

    public int getProductOfNumbersLessFive(){
        return product;
    }

    public int getQuantityOfElements(){
        return top+1;
    }

    public void printStack(){
        if(top==-1){
            System.out.println("Stack is empty!");
        }else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
