import java.util.*;
import java.io.*;
import java.lang.*;
 
public class program4{
static BufferedReader br;
static PrintWriter ot;
    public static void main(String args[]) throws IOException {
br = new BufferedReader(new InputStreamReader(System.in));
ot = new PrintWriter(System.out);
int t = Integer.parseInt(br.readLine().trim());
while(t-- > 0){
String s[] = br.readLine().trim().split(" ");
int V = Integer.parseInt(s[0]);
int E = Integer.parseInt(s[1]);
int edges[][] = new int[E][3];
for(int i = 0; i < E; i++){
s = br.readLine().trim().split(" ");
edges[i][0] = Integer.parseInt(s[0]);
edges[i][1] = Integer.parseInt(s[1]);
edges[i][2] = Integer.parseInt(s[2]);
}
ot.println(new Solution().spanningTree(V, E, edges));
}
ot.close();
}
}
// } Driver Code Ends
 
 
// User function Template for Java
 
class pair{
    
    int node;
    int dis;
    
    pair(int node,int dis)
    {
        this.node=node;
        this.dis=dis;
    }
}
