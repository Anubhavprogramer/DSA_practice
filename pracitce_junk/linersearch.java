import java.util.Scanner;

public class linersearch {
    public static void main(String[] args) {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = SC.nextInt();

        int arr[]= new int[n];

        System.out.println("Enter the array");
        for(int i=0 ; i<n;i++)
        {
            arr[i]= SC.nextInt();    
        }

        System.out.println("Enter the element");
        int find = SC.nextInt();
        int index= -1;

        for(int i = 0;i<n;i++)
        {
            if (arr[i]==find)
            {
                index=i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("We found it at:" +index );
        } else {
            System.out.println("LoL we didn't found it");
        }
    }
}
