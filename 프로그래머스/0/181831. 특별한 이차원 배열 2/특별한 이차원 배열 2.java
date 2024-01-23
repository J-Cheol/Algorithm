class Solution 
{
    public int solution(int[][] arr) 
    {
        int answer = 0;
        int check = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == arr[j][i])
                    answer = 1;
                else
                    check = 1;
            }
        }
        if(check == 1)
            answer = 0;
        return answer;
    }
}