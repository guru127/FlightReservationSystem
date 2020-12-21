package frs_project;

public class TouristTicket {
    private String pnr;
    private String from;
    private String to;
    private String departureDate;
    private int departureTime;
    private String arrivalDate;
    private int arrivalTime;
    private String seatNo;
    private Flight flight;
    private Passenger passenger;
    private Float price;
    private boolean cancelled;

    private String hotelAddress;
    private String[] selecteTouristLocations;

    public TouristTicket(String pnr, String from, String to, String departureDate, int departureTime,
                         String arrivalDate, int arrivaltime, String seatNo, Flight flight,
                         Passenger passenger, Float price, boolean cancelled, String hotelAddress,
                         String[] selecteTouristLocations) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivaltime;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selecteTouristLocations = selecteTouristLocations;
    }

}
