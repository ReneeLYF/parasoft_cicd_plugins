package main.java.examples.rules.cdd;

/**
 * Duplicated method(function)
 */
public class DUPM {
    void _test_() {  //violation
        System.out.println("Hello1");
        System.out.println("Hello2");
    }
}

class DUPM_a {
    void _test_() {  //violation
        System.out.println("Hello1");
        System.out.println("Hello2");
    }
}
