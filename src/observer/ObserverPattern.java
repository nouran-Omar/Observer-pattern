
package observer;

public class ObserverPattern {
    public static void main(String[] args) {
         Store store = new Store();

        Product iphone = new Product("iPhone 17");
        Product samsung = new Product("Samsung Galaxy S26");

        store.addProduct(iphone);
        store.addProduct(samsung);

        Customer NOURAN = new Customer("Nouran");
        Customer DAI = new Customer("Dai");

        store.attach(NOURAN);
        store.attach(DAI);

        store.makeProductAvailable("iPhone 17");

        store.detach(NOURAN);

        store.makeProductAvailable("Samsung Galaxy S27");
    }
}


