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
        stackarr[top++] = onstack;
    }

    public int pop(){
        int tmp = stackarr[top];


        return tmp;
    }


}
