public int firstMissingPositive(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            int CI=nums[i]-1;
            while(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[CI])
            {
                //swap both nums[i] and nums[CI]
                int t=nums[i];
                nums[i]=nums[CI];
                nums[CI]=t;

                CI=nums[i]-1;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
        {
            return i+1;
        }
        }

        return nums.length+1;
        
    }
