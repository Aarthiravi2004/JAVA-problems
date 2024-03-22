class HelloWorld {
    public static void main(String[] args) {
        int n = 705;
        StringBuilder str = new StringBuilder();
        while(n>0)
        {
            int rem = n % 26;
            if(rem == 0)
            {
                str.append("Z");
                n = (n/26) -1;
            }
            else
            {
                str.append((char) ((rem-1)+'A'));
                n/=26;
            }
        }
        System.out.print(str.reverse());
    }
}


Input: 705
OUTPUT : AAC
