import java.util.Scanner;

class romantointiger {
    public int romanToInt(String s) {
        // int num[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","VI","I"};
        int total=0;
        for( int i =0; i<s.length();i++)
        {
            int s1= value(s.charAt(i));
            if(i+1<s.length())
            {
                int s2=value(s.charAt(i+1));
                if(s1>=s2)
                {
                    total = total + s1;
                }
                else
                {
                    total = total -s1;
                }
            }
            else
            {
                total = total + s1;
            }
        }
        return total;
    }

    int value(char r)
    {
        if(r=='I')
        {
            return 1;
        }
        if(r=='V')
        {
            return 5;
        }
        if(r=='X')
        {
            return 10;
        }
        if(r=='L')
        {
            return 50;
        }
        if(r=='C')
        {
            return 100;
        }
        if(r=='D')
        {
            return 500;
        }
        if(r=='M')
        {
            return 1000;
        }
        return -1;
    }

    public static void main (String args[]){
        romantointiger obj =new romantointiger();
        Scanner SC = new Scanner (System.in);
        System.out.println("Enter the Roman Variable: ");
        String s =SC.next();
        int answer = obj.romanToInt(s);

        System.out.println("After converting the Roman values to integer we get: "+answer);

    }
}