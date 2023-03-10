package main.java.examples.rules.cdd;

/**
 * Duplicated field initialization in constructors
 */
public class DFI {
    private int max;
    private int num;

    public DFI() {
        max = 100; // violation
        num = 10;

    }

    public DFI(int n) {
        max = 100; // violation
        num = n;
    }
}