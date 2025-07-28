class Solution {
     public long subArrayRanges(int[] nums) {
        return sumOfSubarrayMax(nums) - sumOfSubarrayMin(nums);
    }

    private long sumOfSubarrayMax(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < (i == n ? Integer.MAX_VALUE : nums[i]))) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long count = (mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            stack.push(i);
        }
        return sum;
    }

    private long sumOfSubarrayMin(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > (i == n ? Integer.MIN_VALUE : nums[i]))) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                long count = (mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            stack.push(i);
        }
        return sum;
    }
}