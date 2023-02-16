class Account{
    int accNo;
    String name;
    float amount;

    void insert(int a, String n,float amt){
        accNo = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt+" deposit");
    }

    void withrow(float amt){
        if(amount<amt){
            System.out.println("Inssufficent balance");
        }
        else{
            amount = amount-amt;
            System.out.println(amt+" nikala");
        }
    }

    void checkbalance(){
        System.out.println("Balance is : "+ amount);
    }
    void display(){
        System.out.println(accNo+" "+name+" "+amount);
    }
}
    class testAccount{
        public static void main(String args[]){
            Account a1 = new Account();
            a1.insert(1001, "pradip", 50000);
            a1.display();
            a1.checkbalance();
            a1.deposit(2000);
            a1.withrow(1500);
            a1.checkbalance();
        }
    }
    

