import java.util.*;

public class Solution {
   public static long ncr(int n,int r){
    long res=1; // generating ncr
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return res;
   }
   public static List<List<Integer>>generate(int n){ //storing pascal triangle using templist
    List<List<Integer>> ans=new ArrayList<>();
    for(int row=1;row<=n;row++){
        List<Integer> tempList=new ArrayList<>();
        for(int col=1;col<=row;col++){
            tempList.add((int)ncr(row-1,col-1));
        }
        ans.add(tempList);
    }
    return ans;
   }
public static void main(String args){
    int n=5;
    List<List<Integer>> ans=generate(n);
    for(List<Integer> ele:ans){
        System.out.print(ele +" ");
    }
    System.out.println();
}
}