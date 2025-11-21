import java.util.*;


class main {

    public static void add(int i, int n, int sum){

        if(i > n ){
            System.out.println(sum);
            return;
        }
        
        sum+=i;
        add(++i,n,sum);

    }

    public static void main (String[] args){

      add(0,10,0);

    }
}