package Objects;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 6: Describing and Using Objects and Classes
Topic: Declare and Instantiate Objects
Sub-Topic: Initializers, Forward References
*/

// For all the examples below, the initializers reference variables
// declared after the blocks.
class Thing {

    // Constructor
    Thing() {
        //secondString = "b";
        //secondString = "b" + thirdString ; //ok because thirdString is a static variable
        secondString = "b" + secondString ; //acbnullc
    }

    // Initializer
    {
        //firstString = "a";
        //firstString = "a" + thirdString; //ok because thirdString is a static variable
        //firstString = "a" + thirdString + secondString; //compile error - illegal forward reference
        //firstString =  secondString; //illegal forward reference
        firstString =  this.secondString; //nullbnullc
    }

    // Static Initializer
    static {
        //System.out.println(thirdString); //compile error - illegal forward reference
        thirdString = "c";
    }

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString + secondString + thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}