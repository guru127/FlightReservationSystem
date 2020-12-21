package frs_project;

public class Main {

    public static void main(String[] args) {
        Passenger passenger=new Passenger(0,"BH.road","Shivamoga","karanata",
                "Guru.n","19962701","guru.1996@gmail.com");
        System.out.println(passenger);

        Flight flight=new Flight("G001","Guru.airways",150,145);
        System.out.println(flight);


        Ticket ticket=new Ticket("a01","Shivamog","mysur","12/12/2020",
                "13/12/2020", "A007",flight,passenger, (float) 4999.0, false );
        System.out.println(ticket);
    }
}
