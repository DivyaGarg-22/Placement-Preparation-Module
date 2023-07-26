class program3
{
    
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a=new ArrayList<>();
        String str="";
        powerSet(0, str, s, a);
        Collections.sort(a);
        return a;
    }
    
    public void powerSet(int i, String str, String s, List<String> ans){
        if(i==s.length()){
            if(!str.isEmpty()){
                ans.add(str);
            }
            return;
        }
        
        powerSet(i+1, str+s.charAt(i), s, ans);
        powerSet(i+1, str, s, ans);
    }
}


