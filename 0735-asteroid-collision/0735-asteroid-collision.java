class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        for(int a:asteroids){
            if(a>0){
                st.push(a);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a)){
                    st.pop();
                }

                if(st.isEmpty() || st.peek()<0 ){
                    st.push(a);
                }else if(st.peek()==Math.abs(a)){
                    st.pop();
                }
            }
        }
        //to convert stack into array
        int[] res=new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}