import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your character : ");
        String val =input.next();
        char a = val.charAt(0);

        if( a =='a' ||  a =='A' ||  a =='e'|| a =='E'|| a =='i'|| a =='I'|| a =='o'|| a =='O'|| a =='u'|| a =='U'){
            System.out.print("Enter latter is Vowels"+"\n");
        }
        else{
            System.out.print("Enter latter is consonent"+"\n");
        }
        input.close();
    }
}
