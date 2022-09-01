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
        System.out.println(" Passed: " + pass + "|| Failed: " + fail);
    }


    static void testConstructStack() {
        Stack dishes = new Stack(5);
        if(dishes.empty()) pass++;
        else {
            fail++;
            LOGGER.log(Level.WARNING, "Failed stack constructor, expected empty got not empty");
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
    }
}
