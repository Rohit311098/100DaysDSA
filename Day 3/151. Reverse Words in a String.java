class Solution {
    public String reverseWords(String s) {
        ArrayList<String> str=new ArrayList<>();
        String temp="";
        int size=s.length()-1;

        while(s.charAt(size)==' ')
        {
            size--;
        }
        int start=0;
        while(s.charAt(start)==' ')
        {
            start++;
        }
        for(int i=start;i<=size;i++)
        {
            
            if(s.charAt(i)==' ' && temp.length()!=0)
            {
                str.add(temp);
                temp="";
            }
            else if(s.charAt(i)!=' ')
            {
               temp=temp+s.charAt(i); 
            }
        }
        str.add(temp);

        String ans="";
        for(int i=str.size()-1;i>=0;i--)
        {
           ans=ans+str.get(i);

           if(i!=0)
           {
             ans+=" ";
           }
        }

        return ans;
        
    }
}
