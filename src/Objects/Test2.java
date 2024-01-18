package Objects;
//question 2
//What is the output from this code:
/*A. Code fails to compile on Line 1

        B. Code fails to compile on Line 2

        C. Code fails to compile on Line 3

        D. Code fails to compile on Line 4

        E. Runtime Exception thrown

        **F. GreatApp

        G. FooBarApp*/
public class Test2 {
    public static void main(String[] args) {
        TestConstants.debugFlag=true;  // Line 3
        System.out.println(TestConstants.APP_NAME);   // Line 4
    }
}
class TestConstants {
    public static boolean debugFlag ;
    public static final String APP_NAME ;  // Line 1
    static {
        if (debugFlag) APP_NAME="FooBarApp";  // Line 2
        else  APP_NAME="GreatApp";
    }
}