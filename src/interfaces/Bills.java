package interfaces;

public class Bills implements Payment {

    @Override
    public void Return(int amount) {
        System.out.println("Return "+amount);
    }
}
