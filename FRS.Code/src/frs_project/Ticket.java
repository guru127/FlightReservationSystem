package frs_project;

public class Ticket {
        private String pnr;
        private String from;
        private String to;
        private String departureTimeStamp;
        private String arrivalTimeStamp;
        private String seatNo;
        private Flight flight;
        private Passenger passenger;
        private Float price;
        private boolean cancelled;

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
        public String checkStatus(){
            if (cancelled){
                return "cancelled";
            }
            else{
                return "not canclled";
            }
        }
        public boolean Cancell(){
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

