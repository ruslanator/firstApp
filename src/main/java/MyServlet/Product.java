package MyServlet;

public class Product {
    private long ID;
    private String title;
    private double cost;

    public Product(long ID, String title, double cost) {
        this.ID = ID;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", title: " + title + ", cost: " + cost + "\n";
    }
}
