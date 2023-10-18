import java.util.*;

public class Insert {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = SC.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

        System.out.println("Enter the index at which you want to insert an element: ");
        int target = SC.nextInt();
        System.out.println("Enter the value to be inserted: ");
        int value = SC.nextInt();

        inserter(arr, target, value);
    }

    static void inserter(int arr[], int target, int value) {
        display(arr);

        int num[] = new int[arr.length + 1];

        for (int i = 0; i < num.length; i++) {
            if (i < target) {
                num[i] = arr[i];
            } else if (i == target) {
                num[i] = value;
            } else {
                num[i] = arr[i - 1];
            }
        }

        display(num);
    }

    static void display(int num2[]) {
        for (int j = 0; j < num2.length; j++) {
            System.out.print(num2[j] + " ");
        }
        System.out.println("");
    }
}
