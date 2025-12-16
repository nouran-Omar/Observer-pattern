package observer;

import java.util.*;

public class Store implements Subject {
    private List<Observer> customers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void makeProductAvailable(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setAvailable(true);
                notifyObservers(product);
                return;
            }
        }
        System.out.println("Store: Product " + productName + " not found.");
    }

    @Override
    public void attach(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObservers(Product product) {
        for (Observer customer : customers) {
            customer.update(product);
        }
    }
}





