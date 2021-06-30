package web.application.model;

public class Product {

    private Long ID;
    private String title;
    private double cost;

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Long getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public Product(long ID, String title, double cost) {
        this.ID = ID;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        //return String.format("Product: [%d %s %f]", ID, title, cost);
        return "ID: " + ID + ", title: " + title + ", cost = " + cost + "\n";
    }
}