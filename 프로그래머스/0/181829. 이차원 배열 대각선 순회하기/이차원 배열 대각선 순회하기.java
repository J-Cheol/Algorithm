class Solution 
{
    public int solution(int[][] board, int k) 
    {
        int answer = 0;
        int i = 0;
        while(i < board.length)
        {
            int j = 0;
            while(j < board[i].length)
            {
                if(i + j <= k)
                    answer += board[i][j];
                j++;
            }
            i++;
        }
        return answer;
    }
}