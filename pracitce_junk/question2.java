class question2 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int num[]= new int[2];
        num[0]=-1;
        num[1]=-1;
        for(int i =0; i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(Math.abs(i-j) >= indexDifference && Math.abs(nums[i]-nums[j]) >= valueDifference)
                {
                    num[0]=i;
                    num[1]=j;
                }
            }

        }

        return num;

    }
}