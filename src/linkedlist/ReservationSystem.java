package linkedlist;

import java.util.LinkedList;

public class ReservationSystem  {
    private int seats;
    LinkedList<String> waitinglist = new LinkedList();
    LinkedList<String> reservedlist = new LinkedList();

    public ReservationSystem(int seats) {
        this.seats=seats;
    }

    public void BookTicket(String name){
        if(reservedlist.size()<seats){
            reservedlist.add(name);
            System.out.println("Ticket confimed for " + name);
        }else{
            waitinglist.add(name);
        }
    }

    public void cancelTicket(String name){
        if(reservedlist.contains(name)){
            reservedlist.remove(name);
            System.out.println("Ticket cancelled for " + name);
        }else if(waitinglist.contains(name)){
            System.out.println(name+" is still in waiting list");
        }else{
            System.out.println("Ticket not found for " + name);
        }
        allocateWaitingList();
    }

    public void display(){
        for(String str:reservedlist){
            System.out.println(str);
        }
    }

    // ✅ Show total, booked, and available seats
    public void showSeatDetails() {
        System.out.println("\n----- Seat Details -----");
        System.out.println("Total seats       : " + seats);
        System.out.println("Booked seats      : " + reservedlist.size());
        System.out.println("Available seats   : " + (seats - reservedlist.size()));
        System.out.println("Waiting list size : " + waitinglist.size());
    }

    public void allocateWaitingList(){
            if(reservedlist.size()<seats){
                reservedlist.addLast(waitinglist.getFirst());
                waitinglist.removeFirst();
            }
    }


    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem(5);
        system.BookTicket("sreeja");
        system.BookTicket("teja");
        system.BookTicket("charani");
        system.BookTicket("juli");
        system.BookTicket("Anirudh");
        system.BookTicket("deepu");
        system.BookTicket("deepak");
        system.cancelTicket("sreeja");
        system.showSeatDetails();
        System.out.println(system.reservedlist);
    }



}
