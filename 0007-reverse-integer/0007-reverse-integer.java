class Solution {
    public int reverse(int x) {
        int reverseNum=0; 
        while(x!=0){
           int lastDigit=x%10;//x=123
           x=x/10;
           if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum < Integer.MIN_VALUE / 10) {
                return 0;  // Return 0 if overflow occurs
            }//123%10=3(LD)=reverseNum= 0*10+3=3
             reverseNum=(reverseNum*10)+lastDigit;
        }//12%10=2 (LD) = revno=3*10+2=32
        
        return reverseNum;

    }
    
}