// User function Template for Java
import java.util.Arrays;

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0,platform=1,maxPlatform=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            maxPlatform=Math.max(platform,maxPlatform);
        }
        return maxPlatform;
        // add your code here
    }
}
