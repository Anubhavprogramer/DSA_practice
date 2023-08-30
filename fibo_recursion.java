class fibo_recursion
{
    public static void main( String[] argss)
    {
        // print first seven febonacci numbers
        System.out.print("0,1,");
        fibo(5,0,1);  
    }
    public static int fibo(int n,int a,int b)
    {
        int c=a+b;
        System.out.print(c+",");
        if( n == 0)
        {
            return 0;
        }
        else
        {
            return fibo(n-1, b, c);
        }
    }
}