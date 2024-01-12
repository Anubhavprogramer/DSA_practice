// x^n when stack hieight should be n
public class recusrionp5 {
    public static void main(String []args)
    {
        int x=5;
        int n=4;
        int ans=power(x,n);
        System.out.println("The answer is "+ans);
    }
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==10)
        {
            return 0;
        }
        int apower=power(x, n-1);
        int xpown= x*apower;
        return xpown;
    }
}
