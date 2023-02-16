public class buffer {
    public static void main(String argd[]){
        StringBuffer txt = new StringBuffer("Hello");

        txt.append(" World");
        txt.insert(5," pradeep");
        System.out.println(txt);
        txt.replace(5,8,"kumar");
        System.out.println(txt);
    }
    
}
