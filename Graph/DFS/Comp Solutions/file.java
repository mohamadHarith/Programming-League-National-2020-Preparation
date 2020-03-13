import java.io.*;
import java.util.*;

public class Solution {

    
    public static class CompareAt implements Comparator<Process>{
        public CompareAt(){}
        
        public int compare(Process p1, Process p2){
            int difference = p1.ppid - p2.ppid;
            if(difference<0 || difference>0){
                return difference;
            }
            else{
                difference = p2.mem - p1.mem;
                return difference;
            }
        }
    }
    
    public static class Process{
        public int pid;
        public int ppid;
        public int mem;
        
        public Process(int pid, int ppid, int mem){
            this.pid = pid;
            this.ppid = ppid;
            this.mem = mem;
        }
        
        
        public String toString(){
            return pid + " " + ppid + " " + mem; 
        }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        ArrayList<Process> processes = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        scanner.next();
        scanner.next();
        scanner.next();
        
        while(scanner.hasNext()){
           processes.add(new Process(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        
        //sort
        CompareAt comp = new CompareAt();
        Collections.sort(processes, comp);
        
        System.out.println("pid ppid rss");
        for(Process p: processes){
            System.out.println(p.toString());
        }
       
    }
}