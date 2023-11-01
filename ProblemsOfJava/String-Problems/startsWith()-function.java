class HelloWorld {
    public static void main(String[] args) {
        String str ="appbcdapplegha";
        String copy = "";
        System.out.print(recursion(str));
    }
    public static String recursion(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if(str.startsWith("apple"))
        {
            return recursion(str.substring(5));
        }
        
           return str.charAt(0) + recursion(str.substring(1));
        
        
    }
}

OUTPUT:
appbcdgha
