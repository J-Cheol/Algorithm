class Solution 
{
    public int[][] solution(int[] num_list, int n) 
    {
        int[][] answer = new int[num_list.length / n][n];
        int i = 0;
        int k = 0;
        while(i < num_list.length / n)
        {
            int j = 0;
            while(j < n)
            {
                answer[i][j] = num_list[k];
                j++;
                k++;
            }
            i++;
        }
        return answer;
    }
}