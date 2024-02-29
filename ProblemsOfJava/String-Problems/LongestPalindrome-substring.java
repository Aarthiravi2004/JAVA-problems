import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String str="geeksforgeegrof";
        String ans="";
        for(int i=1;i<str.length();i++)
        {
            int low=i;
            int high=i;
            while(str.charAt(low)==str.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high == str.length())
                {
                    break;
                }
            }
            String temp = str.substring(low+1,high);
            if(temp.length() > ans.length())
            {
                ans = temp;
            }
            low = i-1;
            high = i;
            while(str.charAt(low)==str.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high == str.length())
                {
                    break;
                }
            }
            temp = str.substring(low+1,high);
            if(temp.length() > ans.length())
            {
                ans = temp;
            }
            
            
        }
        System.out.print(ans);
    }
}


OUTPUT: forgeegrof
