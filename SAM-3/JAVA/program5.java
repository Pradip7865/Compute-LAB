import java.util.Arrays;
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your 1st Number : ");
        int a =input.nextInt();
        System.out.print("Enter your 2st Number : ");
        int b =input.nextInt();
        System.out.print("Enter your 3st Number : ");
        int c =input.nextInt();

        int d[] = {a, b, c};
 
        Arrays.sort(d);
 
        for (int i = 2; i >= 0; i--)
            System.out.print(d[i]+"\n");

        input.close();
    }
    
}
