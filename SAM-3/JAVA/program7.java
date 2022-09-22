import java.util.Random;

public class program7 {
    public static void main(String[] args) {
    int i=0;
    int j=0;
        Random ran =new Random();
        while (i<=2){    
            char w = (char)(ran.nextInt(26)+'A');
            System.out.print(w);
            i++;
    }
    System.out.print("-");
    while (j<=3){    
        System.out.print(ran.nextInt(10)); 
        j++;

    }
    System.out.println();
}
}
