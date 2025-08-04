package arraylist;
import java.util.ArrayList;

public class Product {
    int id;
    String name;
    float price;
    static ArrayList<Product> products =  new ArrayList<>();

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id) {
                System.out.println(products.get(i).name + " has been removed");
                products.remove(i);
                break;
            }
        }
    }

    public void searchProduct(String name) {
        boolean found = false;
        for (Product p :  products) {
            if(p.name.equals(name)) {
                found = true;
                System.out.println(p.name + " has been found");
            }
        }
        if (!found) {
            System.out.println(name + " not found");
        }
    }

    public void display() {
        for (Product p : products) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
