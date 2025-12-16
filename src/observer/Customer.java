package observer;
public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(Product product) {
        if (product.isAvailable()) {
            System.out.println(name + ": Hurray " + product.getName() + " is now available the store");
        }
    }
}

