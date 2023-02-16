// Name :- Shah Rakeshkumar Shankar
// Class :- B.tech (cse(se))
// Enrollment :- 202103103510464



import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class ArrayOPeration {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        Scanner input = new Scanner(System.in);
        System.out.println(
                "*******************************************************************************************************************");
        System.out.println("1. Insertion In Your Array. ");
        System.out.println("2. Deletion In Your Array. ");
        System.out.println("3. Updation In Your Array. ");
        System.out.println("4. Search In Your Array. ");
        System.out.println("5. ËXIT");
        System.out.println(
                "*******************************************************************************************************************");

        System.out.println("Enter Your Choice what you want to perform.  ");
        int a = input.nextInt();

        switch (a) {
            case 1:
                int n = arr.length;
                int index = n - 1;
                System.out.println("Your Original Array " + Arrays.toString(arr));
                Integer newarr[] = new Integer[n + 1];
                int j = 0;
                for (int i = 0; i < newarr.length; i++) {
                    if (i == index) {
                        System.out.println("Enter New Element of Array");
                        int a1 = input.nextInt();
                        newarr[i] = a1;
                    } else {
                        newarr[i] = arr[j];
                        j++;
                    }
                }
                System.out.println("New Array is " + Arrays.toString(newarr));
                break;
            case 2:
                System.out.println("Your Original Array Is " + Arrays.toString(arr));
                System.out.println("Enter the position of the number which is to be deleted");
                int pos = input.nextInt();
                int n1 = 6;
                for (int i = pos; i < n1 - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                n1 = n1 - 1;
                System.out.println("Your Updated Array Is " + Arrays.toString(arr));
                break;

            case 3:
                System.out.println("Your Original Array Is " + Arrays.toString(arr));
                System.out.println("Enter the position of the index which is to be update");
                int pos1 = input.nextInt();
                System.out.println("Enter the value of the replacement");
                int pos3 = input.nextInt();
                Array.set(arr, pos1, pos3);
                System.out.println("Your Updated Array Is " + Arrays.toString(arr));
                break;

            case 4:
                int f = 0, i1 = 0;
                System.out.println("Your Original Array Is " + Arrays.toString(arr));
                System.out.print("Enter the element you want to find:");
                int x = input.nextInt();
                for (i1 = 0; i1 < 6; i1++) {
                    if (arr[i1] == x) {
                        f = 1;
                        break;
                    } else {
                        f = 0;
                    }
                }
                if (f == 1) {
                    System.out.println("Element found at position:" + (i1 + 1));
                } else {
                    System.out.println("Element not found");
                }
                break;
            default:
                break;
        }

    }

}
