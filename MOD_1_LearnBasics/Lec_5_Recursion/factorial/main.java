import java.util.*;


class main {

    public static void factorial(int i, int j, int factorial){

        if(j == 0){
            System.out.println(factorial);
            return;
        }

        factorial(i-1,j-2,factorial);
        

    }

    public static void main (String[] args){

      add(4,1,0);

    }
}