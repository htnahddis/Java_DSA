import java.util.*;

class main {
    public static void main(String[] args) {
    int a = 10;
    int b=12;
      
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    System.out.println(a);
     
    }
}