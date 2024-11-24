class Solution {
    private int[] numList;
    
    public int[] solution(int[] num_list) {
        this.numList = num_list;
        return getReversedArray();
    }
    
    public int[] getReversedArray() {
        int len = numList.length;
        int[] answer = new int[len];
        
        int start_index = 0;
        int end_index = len - 1;
        
        while(start_index < end_index)
        {
            int temp = numList[start_index];
            numList[start_index] = numList[end_index];
            numList[end_index] = temp;
            
            start_index++;
            end_index--;
        }
        int i = 0;
        for(int num : numList)
        {
            answer[i] = num;
            i++;
        }
        return answer;
    }
        
}