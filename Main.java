import java.util.logging.Logger;
import java.util.logging.Level;
class Main{
    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    static int pass = 0;
    static int fail = 0;
    public static void main(String[]args){
        System.out.println("hello world");

        testConstructStack();
        testPush();
        testPushOverflow();
        testPushPushPopPushPushPop();
        testPopWhenEmpty();
        
        System.out.println(" Passed: " + pass + " || Failed: " + fail);
    }


    static void testConstructStack() {
        Stack dishes = new Stack(5);
        if(dishes.empty()) pass++;
        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed stack constructor, expected empty got not empty");
        }
    }

    static void testPushOverflow(){
        boolean hadException = false;
        Stack dishes = new Stack(3);
        dishes.push(1);
        dishes.push(2);
        dishes.push(3);
        try{dishes.push(4);
        }
        catch(RuntimeException e){
            hadException = true;
            pass++;
            System.out.println(e.getMessage()); 

        }
        if(!hadException) fail++;
    }





    static void testPopWhenEmpty(){

        Stack dishes = new Stack(5);
        boolean hadException = false;
        try{
        dishes.pop();
        }
        catch(RuntimeException e) {
            pass++;
            hadException = true;
        }
        if(!hadException){
            fail++;
            LOGGER.log(Level.WARNING, "Failed testPopWhenEmpty expected an exception but DID NOT GET ONE.");
        }
    
        
    }


    static void testPushPushPopPushPushPop(){
        Stack dishes = new Stack(5);
        dishes.push(1);
        dishes.push(2);
        int actual = dishes.pop();
        int expected = 2;
        if(actual == expected) pass++;

        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed multi push pop, expected " + expected + " got " + actual);
        }
        dishes.push(3);
        dishes.push(4);
        actual = dishes.pop();
        expected = 4;
        if(actual == expected) pass++;

        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed multi push pop, expected " + expected + " got " + actual);
        }

    }


    static void testPush(){
        Stack dishes = new Stack(5);
        dishes.push(31);
        if(!dishes.empty()) pass++;
        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed stack push, expected not empty got empty");
        }


        int actual = dishes.pop();
        if(actual == 31) pass++;

        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed stack pop (testing push), expected 31 got " + actual);
        }



    

    
    }




}
