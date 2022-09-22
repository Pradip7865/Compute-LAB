import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Addition\n2.sub \n3.multi");
        int ch =input.nextInt();

        System.out.print("Enter !st number : ");
        int a = input.nextInt();
        System.out.print("Enter 2st number : ");
        int b = input.nextInt();

        switch(ch){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            
        }
        input.close();
    }    
}
