class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long exp=n;

        if(n<0) exp=-exp;

        while(exp>0){
            if(exp%2==1){
                ans=ans*x;
                exp=exp-1;
            }else{
                x=x*x;
                exp=exp/2;
            }
        }
        if(n<0) ans=1.0/ans;
        return ans;
    }
}