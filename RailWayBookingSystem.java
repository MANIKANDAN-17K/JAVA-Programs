public class RailWayBookingSystem{
  public static void main (String[] args) {
    TicketCounter counter = new TicketCounter();
    Passenger p1 = new Passenger(counter,"mani",2);
    Passenger p2 = new Passenger(counter,"bol",3);
    Passenger p4 = new Passenger(counter,"cahrl",2);
    p4.start();
    p2.start();
    p1.start();
  }
}
class TicketCounter{
  private int availableSeats = 3;
  public synchronized void bookTicket(String passangerName,int numSeats){
    if(numSeats <= availableSeats){
      System.out.println(passangerName +" booked " +numSeats+ "seat(s).");
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e)
      {
        System.out.println(e.getMessage());
      }
      availableSeats -= numSeats;
      System.out.println("remaining seats: "+ availableSeats);
    }else{
      System.out.println("sorry" +passangerName+",not enough seats available.");
    }
  }
}
class Passenger extends Thread{
  private TicketCounter counter;
  private String PassengerName;
  private int numSeats;
  public Passenger(TicketCounter counter,String PassangerName,int numSeats){
    this.counter = counter;
    this.PassengerName = PassengerName;
    this.numSeats = numSeats;
  }
  public void run(){
    counter.bookTicket(PassengerName,numSeats);
  }
}
