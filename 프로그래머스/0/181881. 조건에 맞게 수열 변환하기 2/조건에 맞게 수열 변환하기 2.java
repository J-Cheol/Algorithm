class Solution 
{
    public int solution(int[] arr) 
    {
        int answer = 0;
        boolean isSame = false;

        while (!isSame) 
        {
            int[] newArr = new int[arr.length];
            isSame = true;

            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] >= 50 && arr[i] % 2 == 0) 
                {
                    newArr[i] = arr[i] / 2;
                } 
                else if (arr[i] < 50 && arr[i] % 2 == 1) 
                {
                    newArr[i] = (arr[i] * 2) + 1;
                } 
                else 
                {
                    newArr[i] = arr[i];
                }

                if (newArr[i] != arr[i]) 
                {
                    isSame = false;
                }
            }

            if (!isSame) 
            {
                answer++;
                arr = newArr.clone();
            }
        }

        return answer;
    }
}
