public class reverse {
 public static void main(String[] args) {
    String str="janshi is cuty";
    int index=str.length()-1;
    rev(index,str);
 }

 public static void rev(int index, String str)
 {
    if(index==0)
    {
        System.out.print(str.charAt(index));
        return;
    }
    System.out.print(str.charAt(index));
    rev(index-1, str);
 }
}
