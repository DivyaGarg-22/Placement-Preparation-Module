public class program3 {
    public int solve(String A) {
           StringBuilder rev_ = new StringBuilder();
        rev_.append(A);
        rev_.reverse();

        int j=1, i=0;
        String res = A+"$"+rev_;
        int n = res.length();
        int[] prefix = new int[n];
        while(j<n){
            if(res.charAt(i)==res.charAt(j)){
                prefix[j] = i+1;
                i++;
                j++;
            }
            else{
                if(i!=0){
                    i = prefix[i-1];
                }
                else{
                    prefix[j] = 0;
                    j++;
                }
            }
        }
        return A.length()-prefix[n-1];
    }
}
