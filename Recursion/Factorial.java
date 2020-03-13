

import java.util.*;
import java.io.*;


class Factorial {
    
    private static Long fact(Long n){
        if(n == 0){
            return 1L;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        
        final int numberOfTestCases = scanner.nextInt();
        
        ArrayList<Long>testcases = new ArrayList<>();
        
        for(int i=0; i<numberOfTestCases; i++){
           testcases.add(scanner.nextLong());
        }

        for(int i=0; i<testcases.size();i++){
            System.out.println(fact(testcases.get(i)));
        }
	}
}