package arraylist;

import java.util.ArrayList;

public class cart {
    private static ArrayList<Product> cartProducts = new ArrayList<>();
    private static ArrayList<Integer> quantities = new ArrayList<>();

    public cart(Product product, int quantity) {
        addcart(product, quantity);
    }

    public static void addcart(Product product, int quantity) {
        cartProducts.add(product);
        quantities.add(quantity);
    }

    public static void removeCart(int productId) {
        for (int i = 0; i < cartProducts.size(); i++) {
            if (cartProducts.get(i).id == productId) {
                System.out.println(cartProducts.get(i).name + " removed from cart.");
                cartProducts.remove(i);
                quantities.remove(i);
                return; // Exit after removing
            }
        }
        System.out.println("Product with ID " + productId + " not found in cart.");
    }

    public static void displaycart(){
        if (cartProducts.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nItems in your cart:");
        for (int i = 0; i < cartProducts.size(); i++) {
            System.out.println((i + 1) + ". " + quantities.get(i) + " x " +
                    cartProducts.get(i).name + " ($" + cartProducts.get(i).price + ")");
        }
        total();  // Show total price at the end
    }

    public static void total() {
        float totalprice = 0;
        for (int i = 0; i < cartProducts.size(); i++) {
            totalprice += cartProducts.get(i).price * quantities.get(i);
        }
        System.out.println("Total price: $" + totalprice);
    }
}
