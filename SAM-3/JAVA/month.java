import java.util.Scanner;
class month{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number you want to get : ");
    

        int month = input.nextInt();
        // System.out.println(month);

        String mName = "";

        switch(month){
            case 1:mName="1. January";
            break;

            case 2:mName="2. February";
            break;

            case 3:mName="3. March";
            break;

            case 4:mName="4. April";
            break;

            case 5:mName="5. June";
            break;

            case 6:mName="6. July";
            break;

            case 7:mName="7. August";
            break;

            case 8:mName="8. September";
            break;

            case 9:mName="9. October";
            break;

            case 10:mName="10. November";
            break;

            case 11:mName="11. December";
            break;

            case 12:mName="12. January";
            break;

            default:
            System.out.println("");
            System.out.println(month+" is invalid month number");
        }
        System.out.println("");
        System.out.println(mName);
    }
}