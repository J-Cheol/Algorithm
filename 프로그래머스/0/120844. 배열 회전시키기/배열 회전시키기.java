class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int i = 1;
        while(i < numbers.length)
        {
            if(direction.equals("right"))
            {
                answer[i] = numbers[i - 1];
                if(i == 1)
                    answer[0] = numbers[numbers.length - 1];
            }
            if(direction.equals("left"))
            {
                answer[i - 1] = numbers[i];
                if(i == 1)
                    answer[numbers.length - 1] = numbers[0];
            }
            i++;
        }
        
        return answer;
    }
}