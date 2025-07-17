class Solution {
    public boolean find132pattern(int[] nums) {
       int second=Integer.MIN_VALUE;
       int n=nums.length;
      Stack<Integer> st=new Stack<>();
      // it should satisfy condn nums[i] < second<st.peek
      // iterate from last
      for(int i=n-1;i>=0;i--){ 
        //check if nums[i]>2^-31 MIN_VALUE 
        if(nums[i]<second){
            return true;
        }
        while(!st.isEmpty() && nums[i]>st.peek()){
            second=st.pop();
        }
        st.push(nums[i]);
      }
      return false;
    }
}