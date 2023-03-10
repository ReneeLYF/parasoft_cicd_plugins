package main.java.examples.rules.cdd;

/**
 * Duplicated code
 */
public class DUPC {
    public static void main(String[] args){
        int j,m,n;

        j = 0;
        m = 0;
        n = 0;
        for(int i = 0; i<10; i++) {  // violation
            j++;
            m++;
            n++;
        }

        j = 0;
        m = 0;
        n = 0;
        for(int i = 0; i<10; i++) { // violation
            j++;
            m++;
            n++;
        }
    }
}
