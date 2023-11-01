class HelloWorld {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2="";
        subset(str2,str1);
    }
    public static void subset(String str2,String str1)
    {
        if(str1.isEmpty())
        {
            System.out.println(str2);
            return;
        }
        char ch = str1.charAt(0);
        subset(str2+ch,str1.substring(1));
        subset(str2,str1.substring(1));
        
    }
}
OUTPUT:
abc
ab
ac
a
bc
b
c

