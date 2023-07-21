public class Program1 {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> st=new Stack<>();
        int n=A.length;
        int nge[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&& st.peek()>=A[i])
            {
                st.pop();
            }
            if(i<n)
            {
                if(!st.isEmpty()) nge[i]=st.peek();
                else nge[i]=-1;
            }
            st.push(A[i]);
        }
        return nge;
    }
}