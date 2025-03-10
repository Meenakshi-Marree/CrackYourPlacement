class Solution {
    public boolean isPalindrome(int x) {
        int revNo=0;
        int dup=x;
        while(x>0){
            int ld = x%10;
            revNo=(revNo*10)+ld;
            x=x/10;
            
        }
        if(revNo==dup){
            return true;
        }else{
            return false;
        }
    }
}