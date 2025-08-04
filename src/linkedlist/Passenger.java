package linkedlist;

public class Passenger {
    String name;
    boolean ticket_status=true;

    public Passenger(String name, boolean ticket_status) {
        this.name = name;
        this.ticket_status = ticket_status;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTicket_status(boolean ticket_status) {
        this.ticket_status=ticket_status;
    }


}

