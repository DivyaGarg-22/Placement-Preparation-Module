class Program6 {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        Integer arr[]= new Integer[n+m];
        for(int i =0;i<n;i++){
            arr[i]=arr1[i];
        }
        int z=n+m;
        int y=0;
        for(int j =n;j<z;j++){
            
            arr[j]=arr2[y];
            y++;
        }
        
        Arrays.sort(arr);
        long x= arr[k-1];
        return x;
        
    }
}
