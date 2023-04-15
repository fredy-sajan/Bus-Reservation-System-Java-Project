package HelloSample.src.busReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {

        ArrayList<Bus> busses=new ArrayList<Bus>(); // Array List that contains 'Busses'.
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        

        busses.add(new Bus(1, true, 2));
        busses.add(new Bus(2, false, 2));
        busses.add(new Bus(3, true, 2));
        busses.add(new Bus(4, false, 2));
        busses.add(new Bus(5, true, 2));


        int userOption = 1;
        Scanner scanner=new Scanner(System.in);

        for(Bus bus: busses){
            bus.displayBusInfo();
        }

        while(userOption == 1){
            System.out.println("Enter 1 to Book and 2 to exit: ");
            userOption = scanner.nextInt();

            if (userOption == 1) {
                Booking booking=new Booking();

                if(booking.isAvailable(bookings, busses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full, Try another bus or date.");
                }
            }
        }

    }
}
