package frs_project;

public class Flight {
    private String flightNumber;
    private String airline;
    private  int capacity;
    private int bookedSeats;

    public Flight(String flightNumber,String airline, int capacity, int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    public String getFlightDetails(){
        return "flight number: "+this.flightNumber+", airline:"+this.airline+", capacity"+this.bookedSeats;
    }
    public boolean checkAvailability(){
        if (this.bookedSeats<capacity){
            return true;
        }
        else{
            return  false;
        }
    }
    public  void icrementBookingCounter(){
    this.bookedSeats++;
    }
}
