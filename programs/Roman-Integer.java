import java.util.*;
class HelloWorld {
    public static int RomanToInt(char ch)
    {
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;
         return 50;
    }
    public static void main(String[] args) {
        String str = "LXVMC";
        int res=0;
        int s1=0;
        int s2=0;
        for(int i=0;i<str.length();i++)
        {
            s1 = RomanToInt(str.charAt(i));
            if(i+1 < str.length())
            {
               s2 = RomanToInt(str.charAt(i+1));
                if(s1 >= s2)
                {
                    res+=s1;
                }
                else
                {
                    res-=s1;
                }
            }
            else
                res+=s1;
        }
        System.out.print(res);
    }
        
}

