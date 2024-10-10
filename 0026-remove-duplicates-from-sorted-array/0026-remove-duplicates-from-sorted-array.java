class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){ 
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;//{1,1} cur=1 next=1 so continue
            }
            else{
                nums[count]=nums[i];// save in count var
                count++;
            }
        }
        return count;
    }
}
// TC :O(n) we hve only on loop