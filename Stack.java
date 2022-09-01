public class Stack {
    private int top;
    private int stackarr[];
    private int maxsize;

    public Stack(int maxsize){
        this.maxsize = maxsize;
        stackarr = new int[maxsize];
        top = 0;
    }

    public int getTop(){
      return top;
    }

    public boolean empty(){
        return top == 0;
    }

    public void push(int onstack) throws RuntimeException{
        if(top > maxsize-1) throw(new RuntimeException("Stack overflow exception!"));
        stackarr[top] = onstack;
        top++;
    }

    public int pop() throws RuntimeException {
        
        if(empty()){
            throw(new RuntimeException("Stack underflow!!"));
        }

        int tmp = stackarr[--top];
        stackarr[top] = 0;
        

        return tmp;
    
    }
}
