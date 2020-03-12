
import java.util.*;
import java.io.*;

class Fibonacci {
    
    private static int fib(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
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
            System.out.println(fib(testcases.get(i)));
        }
	}
}