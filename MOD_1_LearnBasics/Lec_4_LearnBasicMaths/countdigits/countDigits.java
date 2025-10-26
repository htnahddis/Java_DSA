// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

// Examples:
// Input: n = 4
// Output: 1

// Explanation: There is only 1 digit in 4.



import java.util.*;

// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

// Examples:
// Input: n = 4
// Output: 1

// Explanation: There is only 1 digit in 4.



import java.util.*;

class countDigits {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0 ;
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        int a = num;

        if (num == 0){
            System.out.println("Total number of digits in the number " + a + " is 1" );
        };
        System.out.println("Total number of digits in the number " + a + " is" + (int) Math.log10(Math.abs(num)) + 1 ); 


        // if(num == 0){
        //     System.out.println("Total number of digits in the number " + a + " is 1");
        // }
        // else{
        //      while(num != 0){
        //     num/=10;
        //     count++;
       
        // }
 
        // System.out.println("Total number of digits in the number " + a + " are " + count);
        // }
       

    }


}