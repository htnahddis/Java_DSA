import java.util.*;


class main{

    public static void main (String[] args){

        int num = 1345;
        int reversed = 0;
      

     while (num != 0) {
     reversed = reversed * 10 + num % 10;
     num /= 10;
     }
    System.out.println(reversed);

    }
}