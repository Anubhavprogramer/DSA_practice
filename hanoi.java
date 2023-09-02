public class hanoi {
    public static void main(String[] args) {
        int n=3;
        hanoi_tower(n, "S", "H", "D");
    }   
    public static void hanoi_tower(int n, String Source, String helper,String Destination)
    {
        if(n==1)
        {
            System.out.println("transferingdisc no."+n+" from "+Source+" to "+Destination);
            return;
        }
        hanoi_tower(n-1, Source, Destination, helper);
        System.out.println("transferingdisc no."+n+" from "+Source+" to "+Destination);
        hanoi_tower(n-1,  helper, Source, Destination);
    }     
}

