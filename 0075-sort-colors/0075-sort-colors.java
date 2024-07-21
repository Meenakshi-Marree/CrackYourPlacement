class Solution {
    public void sortColors(int[] nums) {
       //0 red 1 white 2 blue
        int i=0;
        int twoPointer=nums.length-1;
        int zeroPointer=0;
        while(i<=twoPointer)
        {
            if(nums[i]==0)
            {
                swap(nums,i,zeroPointer);
                i++;
                zeroPointer++;
            }
            else if(nums[i]==2)
            {
               swap(nums,i,twoPointer);
                twoPointer--;
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int nums[],int num1,int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}