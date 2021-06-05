public class Main {
    public static void main(String[] args) {
        System.out.println("Stack is based on the array:");
        StackArray ob1 = new StackArray(6);
        try {
            for (int i = 0; i < 6; i++) {
                ob1.push(i);
            }
            System.out.print("Top element of stack: "+ob1.peek()+"\n");
            ob1.printStack();
            System.out.println("Product of numbers less than 5: " + ob1.getProductOfNumbersLessFive());
            ob1.pop();
            ob1.pop();
            ob1.printStack();
            System.out.println("Product of numbers less than 5: " + ob1.getProductOfNumbersLessFive());
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("Stack is based on the list:");
        StackList ob2 = new StackList();
        try {
            for (int i = 0; i < 6; i++) {
                ob2.push(i);
            }
            System.out.print("Top element of stack: "+ob2.peek()+"\n");
            ob2.printStack();
            System.out.println("Product of numbers less than 5: " + ob2.getProductOfNumbersLessFive());
            ob2.pop();
            ob2.pop();
            ob2.printStack();
            System.out.println("Product of numbers less than 5: " + ob2.getProductOfNumbersLessFive());
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
    }
}

