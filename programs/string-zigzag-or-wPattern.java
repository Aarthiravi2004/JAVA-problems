https://leetcode.com/problems/zigzag-conversion/

class Solution {
    public String convert(String str, int n) {
        if(str.length() <= n || n==1)
        {
            return str;
        }
        String res="";
        int row=0;
        int k=0;
        int index=0;
        int t=0;
        while(row < n && index <str.length())
        {
            if(row !=0 && row<n-1)
            {
                boolean down=true;
                for(int i=index;i<str.length();)
                {
                    if(down)
                    {
                        k = ((n-row-1)*2);
                        res+=str.charAt(i);
                        i+=k;
                        down=false;
                    }
                    else
                    {
                        k = ((row+n)-n+1)+t;
                        res+=str.charAt(i);
                        i+=k;
                        down=true;
                    }
                    
                }
                t++;
            }
            else
            {
                k = (n-1)*2;
                for(int i=index;i<str.length();)
                {
                     res+=str.charAt(i);
                    i+=k;
                }
            }
            row++;
            index++;
            
        }
        return res;
    }
}
