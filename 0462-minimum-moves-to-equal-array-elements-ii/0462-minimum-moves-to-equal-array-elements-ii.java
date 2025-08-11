class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int mid = n/2;
        //left half
        for(int i=0;i<n;i++){
            count += Math.abs(nums[i]-nums[mid]);
        }
        return count;
    }
}