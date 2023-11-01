class HelloWorld {
    public static void main(String[] args) {
        for(int i=0;i<11;i++){
        System.out.println(fiboFormula(i));
        }
    }
    public static int fiboFormula(int n)
    {
        return (int)((Math.pow(((1+ Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }
}
Output:
0
1
1
2
3
5
8
13
21
34
55
