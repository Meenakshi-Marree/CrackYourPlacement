class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
      for(int i=0;i<nums.length;i++)
      {
        int indexToBeNegative=Math.abs(nums[i])-1;//element occured past should be added to ans(i.e ele repeated)
        if(nums[indexToBeNegative]<0)
        {
            ans.add(Math.abs(nums[i]));//added abs value eg.-2 their means add '2' to ans
        }
        else
        {
            nums[indexToBeNegative]=-nums[indexToBeNegative];//make abs value -ve
        }
      }
      return ans;
    }
}