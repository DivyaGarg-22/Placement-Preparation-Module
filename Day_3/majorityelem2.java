class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int num2=-2;
        int n=nums.length;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==num1){ ct1++;
            }
            else if(nums[i]==num2){
                ct2++;
            }
            else if(ct1==0){
                num1=nums[i];
                ct1=1;
            }else if(ct2==0){

                num2=nums[i];
                ct2=1;
            }else{
                ct1--;
                ct2--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        ct1=0;
        ct2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==num1){
                ct1++;
            }
            if(nums[i]==num2){
                ct2++;
            }
        }
        if(ct1>n/3) ans.add(num1);
        if(ct2>n/3) ans.add(num2);
        return ans;
        }
    
}