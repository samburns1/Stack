public class Stack {
    private int top;
    private int stackarr[];

    public Stack(int maxsize){
        stackarr = new int[maxsize];
        top = 0;
    }

    public int getTop(){
      return top;
    }

    public boolean empty(){
        return top == 0;
    }

    public void push(int onstack){
        stackarr[top] = onstack;
        top++;
    }

    public int pop() throws RuntimeException {
        
        if(empty()){
            throw(new RuntimeException("Stack underflow"));
        }

        int tmp = stackarr[--top];
        stackarr[top] = 0;
        

        return tmp;
    
    }
}
