class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst( nums,  target);
        int last=findLast( nums, target);
        return new int[] {first,last};
    }
    private int findFirst(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int index=-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                    if(nums[mid]==target)
                    {
                        index=mid;
                    }
                    right=mid -1;
            }
                
        }
            return index;
    }
    
    private int findLast(int[] nums, int target)
    {
        int left=0;
        int right=nums.length-1;
        int index=-1;

        while(left<=right)
        {
             int mid=(left+right)/2;
            if(nums[mid]>target)
            {
                right=mid -1;
            }
            else
            {
                if(nums[mid]==target)
                    {
                        index=mid;
                    }
                    left=mid+1;
            }
                
        }
        return index;
    }
}
