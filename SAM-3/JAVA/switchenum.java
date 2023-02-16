public class switchenum {
    public enum day {
        sun, mon, tue, wed, thu, fri, sat
    }

    public static void main(String args[]) {
        day[] d = day.values();

        for (day now : d) {
            switch (now) {
                case sun:
                    System.out.println("Sunday");
                    break;

                case mon:
                    System.out.println("MOnday");
                    break;
                case tue:
                    System.out.println("Tuesday");
                    break;

                case wed:
                    System.out.println("Wednesday");
                    break;

                case thu:
                    System.out.println("Thursday");
                    break;

                case fri:
                    System.out.println("Friday");
                    break;
                case sat:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("Invalid day");
                    break;
            }
        }
    }

}
