class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int longest = 1;
        int cnt = 1;

        // Sort the array first
        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            // If current number is consecutive to the previous one
            if (nums[i] == nums[i - 1] + 1) {
                cnt++;
            }
            // If it's not consecutive, reset the count
            else if (nums[i] != nums[i - 1]) {
                cnt = 1;
            }

            // Keep track of the longest streak
            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
