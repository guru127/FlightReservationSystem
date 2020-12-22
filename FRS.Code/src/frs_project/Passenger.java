package frs_project;

public class Passenger {
 private static int idcounter=0;
 private int id;
          //creating address class
    private static class Address{
       private String street;
       private String city;
       private String state;

       public Address(String street, String city, String state) {
           this.street=street;
           this.city=city;
           this.state=state;
       }
   }
     // creating conctact class
   private  static class Contact{
       private String name;
       private String phone;
       private String email;

       public Contact(String name, String phone, String email) {
           this.name=name;
           this.phone=phone;
           this.email=email;
       }
   }

    private Address address;
    private Contact contact;
          // constructer for passenger
   public Passenger( String street,String city,String state,String name, String phone , String email){
      this.id = ++idcounter;
      this.address=new Address(street, city,state);
      this.contact=new Contact(name,phone,email);
   }
    public int getId() {
        return this.id;
    }
    public String getAdressDeatailes(){
      return "street: "+address.street+", city: "+address.city+", state: "+address.state;
    }
    public  String getContactDetails(){
       return "name: "+contact.name+", phone:"+contact.phone+", email: "+contact.email;
    }
    public static int getPassengercount(){
       return idcounter;
    }

}
