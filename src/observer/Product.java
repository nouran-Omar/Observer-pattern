package observer;

public class Product {
    private String name;
    private boolean available;

    public Product(String name) {
        this.name = name;
        this.available = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

