class Program1
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
      int meetings[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            meetings[i][0]=i;
            meetings[i][1]=start[i];
            meetings[i][2]=end[i];
        }
            
        Arrays.sort(meetings, Comparator.comparingDouble(o->o[2]));
        int maxMeet=1;
        int lastIdxEnd=meetings[0][2];
        for(int i=0;i<end.length;i++){
            if(meetings[i][1]>lastIdxEnd){
                maxMeet++;
                lastIdxEnd=meetings[i][2];
            }
        }
        return maxMeet;
    }
}