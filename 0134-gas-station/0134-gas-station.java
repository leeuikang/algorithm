class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cal = 0;
        int checkMinus = 0;
        int answer = 0;
        
        for(int i = 0; i < gas.length; i++){
            cal += gas[i] - cost[i];
            checkMinus += gas[i] - cost[i];
            
            if(cal < 0){
                cal = 0;
                answer = i + 1;
            }
        }
        
        if(checkMinus < 0)
            return -1;
        return answer;
    }
}