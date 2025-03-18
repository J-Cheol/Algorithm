class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(long i = 0; count > 0; count--) {
            i += price;
            sum += i;
        }
        
        if(money < sum) {
            answer = sum - money;
        }

        return answer;
    }
}