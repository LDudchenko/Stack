public class StackList {
    private LinkedList stack = new LinkedList();
    private int product = 1;

    public int pop() throws StackException{
        if(stack.isEmpty()){
            throw new StackException("Stack is empty!");
        }
        if(stack.getStart().data<5&&stack.getStart().data!=0){
            product/=stack.getStart().data;
        }
        return stack.removeStart();
    }

    public void push(int value){
        if(value<5&&value!=0){
            product*=value;
        }
        stack.insertStart(value);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int peek() throws StackException{
        if(stack.isEmpty()){
            throw new StackException("Stack is empty!");
        }
       return stack.getStart().data;
    }

    public int getProductOfNumbersLessFive(){
        return  product;
    }

    public int getQuantityOfElements(){
        return stack.getLength();
    }

    public void printStack(){
        if(stack.getStart()==null){
            System.out.println("Stack is empty!");
        }else {
            stack.printList();
        }
    }
}

class LinkedList {
    private Node start;

    public void insertStart(int data){
        Node element = new Node(data);
        element.next = start;
        start = element;
    }

    public int removeStart(){
        Node node = start;
        start = start.next;
        return node.data;
    }

    public boolean isEmpty(){
        return start==null;
    }

    public Node getStart(){
        return start;
    }

    public int getLength(){
        Node element = start;
        int length =0;
        while(element!=null){
            element = element.next;
            length++;
        }
        return length;
    }

    public void printList(){
        Node element = start;
        while(element!=null){
            System.out.print(element.data+" ");
            element = element.next;
        }
        System.out.println();
    }
}

class Node{
    int data;
    Node next;

    public Node(){
        data = 0;
        next = null;
    }

    public Node(int d){
        data = d;
        next = null;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }

}
