class Program5 {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count=0,flag=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
              count++;
              if(count>flag){
                  flag=count;
              }
          }else{
              count=0;
          }
      }
      return flag;
    }
}