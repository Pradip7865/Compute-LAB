import java.util.Scanner;
public class interest {
 

 
public static void main(String[] args){ 
    Scanner i = new Scanner(System.in);
     System.out.print("Enter Amount: ");
      float p = i.nextFloat();
System.out.print("Enter the rate (in %): ");
 float r = i.nextFloat();
System.out.print("Enter Years: ");
 float t = i.nextFloat();
float SI = p + (p * r * t)/100;
System.out.println("The Simple Interest is: "+ SI);
 i.close();
}
}