import java.util.*;

public class program9 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int a[][] = new int[6][6];
        Random rand = new Random();
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = rand.nextInt(2);
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < a.length; i++) {
            int temp = 0;
            for (j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    temp++;
                }
            }
            if (temp % 2 == 1) {
                System.out.println("The row " + (i + 1) + " is odd and " + temp + " times one");
            }
        }
        for (i = 0; i < a.length; i++) {
            int temp = 0;
            for (j = 0; j < a.length; j++) {
                if (a[j][i] == 1) {
                    temp++;
                }
            }
            if (temp % 2 == 1) {
                System.out.println("The column " + (i + 1) + " is odd and " + temp + " times one");
            }
        }
        int temp = 0;
        for (i = 0; i < a.length; i++) {

            for (j = 0; j < a.length; j++) {
                if (a[j] == a[i] && a[i][j] == 1) {
                    // if(a[i][j]==1)
                    temp++;
                }
            }
        }
        if (temp % 2 == 1) {
            System.out.println("The diagonal is odd and " + temp + " times one");
        }


        int temp1 = 0;
        for (i = 0; i < a.length; i++) {

            for (j = 0; j < -a.length; j++) {
                if (a[i][j] == 1) {
                    // if(a[i][j]==1)
                    temp1++;
                }
            }
        }
        if (temp1 % 2 == 1) {
            System.out.println("The second diagonal is odd and " + temp1 + " times one");
        }
    }
}
