import java.util.*;
//There are similar on jsut priniting they are skipped.
class main {

      public static void printing(int n, int i) {
        // Your existing recursion logic for printing
        if (i > n) {
            return;
        }
        System.out.println("Name"); // Or whatever you intend to print
        printing(n, i + 1);
    }

    public static void main (String[] args){
    
    
    int n =10;
    printing(10,0);

    }
}