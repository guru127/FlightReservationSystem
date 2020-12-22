package frs_project;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Passenger passenger=new Passenger("BH.road","Shivamoga","karanata",
                "Guru.n","19962701","guru.1996@gmail.com");
        System.out.println(passenger);

        Flight flight=new Flight("G001","Guru.airways",150,145);
        System.out.println(flight);

        Ticket.RegularTicket ticket=new Ticket.RegularTicket("a01","Shivamog","mysur",
                "12/12/2020", "13/12/2020", "A007",flight, passenger,
                (float) 4999.0, false, "fooding");
        System.out.println(ticket);
        System.out.println(Ticket.printTicketdeatiles(ticket));

        String[] locations={"palcae","zoo","hill","temple"};
        Ticket.TouristTicket ticket1=new Ticket.TouristTicket("a002","shivamoga","mysure","12/12/2020",
               "13/12/2020","A008",flight,passenger, (float) 5999.0,false,
               "Hotel Grand,nearcity center",locations) ;
        System.out.println(ticket1);
        System.out.println(Ticket.printTicketdeatiles(ticket1));

       // System.out.println(Arrays.toString(ticket1.getSelecteTouristLocations()));

    }
}
