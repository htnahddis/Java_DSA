import java.util.*;

class main {
    public static void main (String[] args){

       double num = 111;
        int totalDigits=0;
        double armstrong =0;

    

     
            while(num != 0){
            num/=10;
            totalDigits++;
        }

        System.out.println( totalDigits);
          System.out.println( Math.pow(num, totalDigits));
        
         while (num != 0) {
         armstrong = (Math.pow(armstrong, totalDigits)) + num % 10;
         num /= 10;
        
        }

       System.out.println(armstrong);



    }
}