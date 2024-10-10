class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0; // initialize count =0
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){ //cur ele != val
                nums[count]=nums[i]; //i=0 3=3,i=1 2!=3 nums[count]=nums[0]=2(val)
                count++;
            }
        }
        return count;
    }
}