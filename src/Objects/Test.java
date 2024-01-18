package Objects;
//question 1
public class Test {
    public static void main(String[] args) {
        TestStatic t0 = new TestStatic();
        TestStatic t1 = null;

        //*   Insert code here *//

        //Which of the lines when inserted in the space specified will cause a compiler error?
        //None :All of the lines compile.
        // You can reference a static variable or method like an instance variable.
        // You can also reference a static class member using a null object
        // or just using the class name of the class where the static variable is declared.

    }
}

class TestStatic {
    static String name = "Mary";

    public static String getName() {
        return name;
    }
}
