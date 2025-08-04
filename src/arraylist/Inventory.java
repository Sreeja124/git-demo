package arraylist;

public class Inventory {
    public static void main(String[] args) {
         Product p= new Product();
         p.addProduct(new Product(1, "Spinach", 4.25f));
         p.addProduct(new Product(2, "Tomato", 2.75f));
         p.addProduct(new Product(3, "Cheese", 2.75f));
         p.addProduct(new Product(4, "eggs", 8.95f));
         p.addProduct(new Product(5, "Pepper", 1.75f));
         p.addProduct(new Product(6, "Potato", 1.75f));

         p.removeProduct(4);
         p.searchProduct("Pasta");
         p.display();
         p.searchProduct("Tomato");

         cart.addcart(Product.products.get(1), 3);
         cart.addcart(Product.products.get(2), 2);
         cart.addcart(Product.products.get(3), 1);
         cart.displaycart();
    }
}
