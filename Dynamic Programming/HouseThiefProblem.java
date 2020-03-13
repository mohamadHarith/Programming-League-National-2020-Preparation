import java.lang.*;


class HouseThiefProblem{
   
    public  static int findMaxSteal(int[] wealth){
        int [] dp = new int[wealth.length+2];
        dp[wealth.length]=0;
        dp[wealth.length+1]=0;
        for(int i=wealth.length-1; i>=0; i--){
            dp[i] = Math.max(wealth[i]+dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
   
    public static void main(String[] args){
        int [] wealth = {6, 7, 1, 30, 8, 2, 4};

        int result = findMaxSteal(wealth);

        System.out.println(result);
    }
}