

import java.util.*;
import java.io.*;

class Factorial {
    
    private static int fact(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        
        final int numberOfTestCases = scanner.nextInt();
        
        ArrayList<Integer>testcases = new ArrayList<>();
        
        for(int i=0; i<numberOfTestCases; i++){
           testcases.add(scanner.nextInt());
        }

        for(int i=0; i<testcases.size();i++){
            System.out.println(fact(testcases.get(i)));
        }
	}
}