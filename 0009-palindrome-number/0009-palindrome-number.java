class Solution {
    public boolean isPalindrome(int x) {
       int reverseNo = 0;
       int dup =x;
       while(x>0){
        int ld = x%10;
        x=x/10;

        reverseNo = (reverseNo*10)+ld;

        
       }
       if(reverseNo == dup){
            return true;
        }else{
            return false;
        }
    }
}