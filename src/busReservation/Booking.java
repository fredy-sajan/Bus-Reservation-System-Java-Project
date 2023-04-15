package HelloSample.src.busReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date; 
    
    Booking(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name of passenger: ");
        passengerName = scanner.next();

        System.out.println("Eter bus no: ");
        busNo = scanner.nextInt();

        System.out.println("Enter date dd-mm-yyyy: ");
        String dataInput = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dataInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> busses){
        
        int capacity = 0;

        for(Bus bus: busses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for(Booking booking: bookings){
            if(booking.busNo == busNo && booking.equals(date)) {
                booked++;
            }
        }

        return booked < capacity ? true : false;

    }

}
