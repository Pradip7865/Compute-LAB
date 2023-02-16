public class display {
public static void main(String args[]){
    Employee a1 = new Employee();
    Employee a2 = new Employee();
    Employee a3 = new Employee();
    a1.insert(1001, "pradip", "surat");
        a2.insert(1001, "pradip", "surat");
        a3.insert(1001, "pradip", "surat");

    a1.show();
    a2.show();
    a3.show();
}    
}

class Employee{
    int id;
    String name;
    String address;

    void insert(int a,String b, String c){
        id=a;
        name=b;
        address=c;
    }

 void show(){
    System.out.println(id+" "+name+" "+address);
 }
}
