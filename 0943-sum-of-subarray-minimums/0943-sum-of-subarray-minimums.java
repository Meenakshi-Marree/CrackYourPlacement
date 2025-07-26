class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;

        int[] ple = new int[n];  // Previous Less Element distance
        int[] nle = new int[n];  // Next Less Element distance

        Stack<Integer> stack = new Stack<>();

        // Previous Less Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear(); // Reuse stack for Next Less Element

        // Next Less Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long result = 0; // Use long to prevent overflow
        for (int i = 0; i < n; i++) {
            long contribution = ((long) arr[i] * ple[i] * nle[i]) % mod;
            result = (result + contribution) % mod;
        }

        return (int) result;
    }
}
