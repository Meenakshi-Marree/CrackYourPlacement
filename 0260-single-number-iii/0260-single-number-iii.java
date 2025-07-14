class Solution {
    public int[] singleNumber(int[] nums) {
        int res=0;
        for(int num : nums){
            res=res^num;
        }
        int num1=0,num2=0;
        int rightMostBit=res & -res;
        for(int num: nums){
            if((num & rightMostBit)!=0){
                num1=num1^num;
            }else{
                num2=num2^num;
            }
            
        }
        return new int[]{num1, num2};
    }
}