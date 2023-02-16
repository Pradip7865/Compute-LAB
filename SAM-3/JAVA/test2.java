class test2{
    int id ;
    String name;
}
class test3{
    public static void main(String args[]){
        test2 s1 = new test2();
        test2 s2 = new test2();

        s1.id = 32;
        s2.id = 45;
        System.out.println(s1.id);
    }
}