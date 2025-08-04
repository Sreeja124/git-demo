package interfaces;

public interface Payment {
    static void pay(int amount){
        System.out.println("Pay "+amount);
    }
    public void Return(int amount);
}
