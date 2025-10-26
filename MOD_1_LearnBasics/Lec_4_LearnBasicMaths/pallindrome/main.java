import java.util.*;


class main{

    public static void main (String[] args){

        int num = 1221;
        int reversed = 0;
        int store = num;
      

     while (num != 0) {
    reversed = reversed * 10 + num % 10;
    num /= 10;
    }

    System.out.println(store + "and" + reversed);
    if(store == reversed){
        
     System.out.println("It is a pallindrome");
    }
    else{
        System.out.println("It is not a pallindrome");
    }

    }
}