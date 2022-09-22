import java.util.Scanner;

public class largestno{
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int c = b.nextInt();
        System.out.println("Enter 1st number");
        int d = b.nextInt();
        System.out.println("Enter 1st number");
        int e = b.nextInt();



        if (c>d && c>e)
        {
            System.out.println(c);
        }
        else if (d>c && d>e)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println(e);
        }
        b.close();
    }
}