// we concatenate using two methods "+" and using concat(); 

// example :

import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        
        // concatinating method 1
        String s1 = "I";
        String s2 = " am";
        String s3 = " Aniketh";
        System.out.println(s1+s2+s3);
        
        // concatinating method 2
        System.out.println(s1.concat(s2+s3));
    }
}
