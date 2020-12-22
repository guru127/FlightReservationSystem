package frs_project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Ticket {
        private  String pnr;
        private  String from;
        private  String to;
        private  String departureTimeStamp;
        private  String arrivalTimeStamp;
        private  String seatNo;
        private  Float price;
        private boolean cancelled;

         private final Flight flight;
         private final Passenger passenger;

        public Ticket(String pnr, String from, String to, String departureTimeStamp, String arrivalTimeStamp,
                      String seatNo, Flight flight, Passenger passenger, Float price, boolean cancelled) {
            this.pnr = pnr;
            this.from = from;
            this.to = to;
            this.departureTimeStamp = departureTimeStamp;
            this.arrivalTimeStamp = arrivalTimeStamp;
            this.seatNo = seatNo;
            this.flight = flight;
            this.passenger = passenger;
            this.price = price;
            this.cancelled = cancelled;
        }

    public static String printTicketdeatiles(Ticket ticket) {
        return ticket.pnr;
    }
    // method for  calculation of flight duration
    public int getFlightDuration() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime departureDateTime = LocalDate.parse("12/12/2020", df).atStartOfDay();
        LocalDateTime arrDteTime  = LocalDate.parse("11/11/2020", df).atStartOfDay();
        return (arrDteTime.getDayOfMonth() - departureDateTime.getDayOfMonth()) * 24 + (arrDteTime.getHour()
                - departureDateTime.getHour());
    }

    // creating RegularTicket class witch extends Ticket class
    //  using super key word to access parent attributes and methods
    public static class RegularTicket extends Ticket {
        private String specialServices;

        public RegularTicket(String pnr, String from, String to,String departureTimeStamp, String arrivalTimeStamp,String seatNo, Flight flight,
                             Passenger passenger, Float price, boolean cancelled,String specialServices) {
            super(pnr,from,to,departureTimeStamp,arrivalTimeStamp,seatNo,flight,passenger,price,cancelled);
            this.specialServices = specialServices;
        }
        public  String getSpecialServices(){
            return this.specialServices;
        }
        public void setSpecialServices(String specialServices){
            this.specialServices=specialServices;
        }
    }
          // creating static TouristTicket class which extends Ticket class
          // and using super key word to access parent attributes and methods
    public static class TouristTicket extends Ticket {

        private final String hotelAddress;
        private final String[] selecteTouristLocations;

        public TouristTicket(String pnr, String from, String to, String departureTimeStamp,
                             String arrivalTimeStamp, String seatNo, Flight flight, Passenger passenger,
                             Float price, boolean cancelled, String hotelAddress, String[] selecteTouristLocations) {
            super(pnr, from, to, departureTimeStamp,arrivalTimeStamp, seatNo, flight, passenger, price, cancelled);
            this.hotelAddress = hotelAddress;
            this.selecteTouristLocations = selecteTouristLocations;
        }

        public String getHotelAddress(){
            return hotelAddress;
        }

        public String[] getSelecteTouristLocations() {
            return selecteTouristLocations;
        }
       // removing location from the list of selected Tourist Locations
        public void removeTouristLocation(String location){
            for (int i=0; i<selecteTouristLocations.length;i++){
                if (location.equals(selecteTouristLocations[i])) {
                    selecteTouristLocations[i]=null;
                }
            }
        }
    }
        public String checkStatus(){
            if (cancelled){
                return "cancelled";
            }
            else{
                return "booked";
            }
        }
        public boolean CancellTicket(){

            return this.cancelled=true;
        }


    @Override
    public String toString() {
        return "Ticket{" +
                "pnr='" + pnr + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureTimeStamp='" + departureTimeStamp + '\'' +
                ", arrivalTimeStamp='" + arrivalTimeStamp + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", price=" + price +
                ", cancelled=" + cancelled +
                '}';
    }
}

