import java.util.Scanner;

public class selectionsort {
    public int[] arrayinput()
    {
        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= SC.nextInt();

        int arr[]=new int [n];
        System.out.println("Enter the elements of that array");
        for(int i=0;i<n;i++)
        {
            arr[i]=SC.nextInt();
        }

        return arr;
    }
    public void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public void sortArray(int arr[])
    {
        int n= arr.length;
        int minindex;
        for(int i=0;i<n-1;i++)
        {
            minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    minindex=j;
                }
            }

            //swaping the array

            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
        int arr[]=obj.arrayinput();
        obj.printArray(arr);
        obj.sortArray(arr);
        obj.printArray(arr);
    }
}
