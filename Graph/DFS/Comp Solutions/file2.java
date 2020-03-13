import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfSteps = scanner.nextInt();
        
        int max = 0 ;
        int result = 0;
        for(int i=0; i<numberOfSteps; i++){
            if(result != -1){
                result = check(scanner.nextInt(), scanner.nextInt());
                if(result == -1){
                   max = -1;
                }
                else if(result != -1){
                    max = max + result;
                }
            }
        }
        
            System.out.println(max);
    
    }
    
    public static int check(int left, int right){
        
        //check whether divisible
        if(left%10 == 0 && right%10 == 0){
            return -1;
        }
        else{
            int maxNumber=0;
            if(left > right){                
                 if(left%10 == 0){
                     maxNumber = right;
                }
                else{
                    maxNumber = left;
                }
            }
            else if(right > left){
                if(right%10==0){
                    maxNumber = left;
                }
                else{
                    maxNumber = right;
                }
            }
            else{
                maxNumber = left;
            }
            return maxNumber;
        }
    }
}