import java.util.* ;
import java.io.*; 
public class countinversion {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}