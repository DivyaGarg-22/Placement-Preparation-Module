class program6
{
    public int maxSumIS(int arr[], int n)  
    {  
        //code here.
          
        int dp[]=new int[n];
        
        int omax=0;
        int c=0;
        
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                  if(dp[j]>max){
                      max=dp[j];
                  }


                }
            }
            dp[i]=max+arr[i];
            if(dp[i]>omax){
                omax=dp[i];
            }
        }
        return omax;
    }  
}

+