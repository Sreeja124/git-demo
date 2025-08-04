package innerclass;

public class Hotel {
    String HotelName;

   public static abstract class Availability{
        public abstract boolean isAvailable();
    }

    public static class Book_room extends Availability {

        @Override
        public boolean isAvailable() {
            return true;
        }

        public void book(String guest_name){
            System.out.println("Room booked for "+guest_name);
        }
    }
}
