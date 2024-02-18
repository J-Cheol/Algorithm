class Solution 
{
    public int[] solution(int[] arr, int[][] queries) 
    {
        int[] answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++)
        {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        int i = 0;
        while(i < arr.length)
        {
            answer[i] = arr[i];
            i++;
        }
        return answer;
    }
}