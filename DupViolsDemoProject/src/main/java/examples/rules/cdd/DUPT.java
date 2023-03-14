package main.java.examples.rules.cdd;

import javax.naming.NamingException;
import java.util.Vector;

/**
 * Duplicate class
 */
public class DUPT {
    Vector v;
    NamingException ne;

    void test1(){
        System.out.println("Hello1.1");
        System.out.println("Hello2.1");
    }
     void test2(){
         System.out.println("Hello3.1");
         System.out.println("Hello4.1");
     }
}

class DUPT_a {
    Vector v;
    NamingException ne;

    void test1(){
        System.out.println("Hello1.2");
        System.out.println("Hello2.2");
    }
    void test2(){
        System.out.println("Hello3.2");
        System.out.println("Hello4.2");
    }
}
