class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int num2=0;
        while(num>0)
        {
            int temp=num%10;
            num=num/10;
            num2=num2*10+temp;
        }

        if(x==num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}