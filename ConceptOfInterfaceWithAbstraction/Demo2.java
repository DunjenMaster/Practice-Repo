package ConceptOfInterfaceWithAbstraction;

interface Member{
    public void callBack();
}

class Store{
    Member mem[] = new Member[50];
    int count = 0;

    void register(Member m){
    mem[count] = m;
    count++;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++){ 
            mem[i].callBack();
        }
    }

}

class Customer implements Member{
    String name;

    Customer(String n){
        this.name = n;
    }

    public void callBack(){
        System.out.println("Ok, I will visit the store, " + name);
    }
}


public class Demo2 {
    public static void main(String[] args){
        Store s = new Store();
        s.register(new Customer("John"));
        s.register(new Customer("Mary"));
        s.register(new Customer("Steve"));
        s.register(new Customer("Raj"));
        s.register(new Customer("Rahul"));
        s.inviteSale();
    }

}
