class test1{
    int id ;
    String name ;
}
class test2{
    public static void main(String args[]){
        test1 s1 = new test1();
        s1.id = 54;
        s1.name = "helo";

        System.out.println(s1.id+" "+s1.name);
    }
}