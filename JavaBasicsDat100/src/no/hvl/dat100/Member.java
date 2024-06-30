package no.hvl.dat100;

public interface Member {
    void callback();

}

class Store {
    Member members[] = new Member[101];
    int counter = 0;


    void register(Member m) {
        members[counter] = m;
        counter++;
    }

    void inviteSale() {
        for (int i = 0; i < counter; i++) {
            members[i].callback();
        }
    }


    static class Customer implements Member{
        String name;

        Customer(String name) {
            this.name = name;
        }

        public void callback() {
            System.out.println("Ok, I will visit, " + name);
        }

    }

    public static void main(String[] args) {
        Store store= new Store();
        Customer newCustomer= new Customer("Elina");
        Customer secondCustomer= new Customer(" Olav");
        store.register(newCustomer);
        store.register(secondCustomer);
        store.inviteSale();

    }
}
