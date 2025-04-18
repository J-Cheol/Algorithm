class Solution {
    public int solution(int chicken) {
        int answer = -1;
        
        answer = serviceChicken(chicken);
        
        return answer;
    }
    
    public int serviceChicken(int orderChicken) {
        if(orderChicken < 10) {
            return 0;
        }
        int service = orderChicken / 10;
        int remainder = orderChicken % 10 + service;
        
        return serviceChicken(remainder) + service;
    }
}