

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
           Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int maxi=0;

//Find Maximum deadline
        for(int i=0;i<n;i++){
            maxi=Math.max(arr[i].deadline,maxi);
        }

// Use Data Structure to Store the job ids on the basic of free slots available in decreasing order Profit use rightmost slot to get maximum profit


        int[] res=new int[maxi+1];
        int countJob=0;
        int jobProfit=0;
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){

//Free Slot found
                if(res[j]==-1){
                    res[j]=arr[i].id;

// Increment Number of Jobs
                    countJob++;

// Add to the profit
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }
        int [] ans=new int[2];
        ans[0]=countJob;
        ans[1]=jobProfit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/