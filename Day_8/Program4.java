class Program4
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new ItemComparator());
        int curr=0;
        double res=0.0D;
       for(int i=0;i<n;i++){
           if(curr+arr[i].weight<=W){
               curr+=arr[i].weight;
               res+=arr[i].value;
           }
           else{
               int rem=W-curr;
               res+=((double)(arr[i].value)/(double)(arr[i].weight))*((double)(rem));
               break;
           }
       } 
       return res;
    }
}
class ItemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
        double r1=((double)(a.value))/((double)(a.weight));
        double r2=((double)(b.value))/((double)(b.weight));
        if(r1<r2){
            return 1;
        }
        else if(r1>r2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
