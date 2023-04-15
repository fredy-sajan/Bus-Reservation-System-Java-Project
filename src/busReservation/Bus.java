package HelloSample.src.busReservation;

public class Bus {
    
    private int busNo;
    private boolean ac;
    private int capacity; 

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getCapacity() { // accessor method
        return capacity;
    }

    public int getBusNo() { // accessor 
        return busNo;
    }

    public boolean isAc() { // accessor
        return ac;
    }

    public void setAc(boolean ac) { // mutator
        this.ac = ac;
    }

    public void setCapacity(int capacity) { // mutator
        this.capacity = capacity;
    }

    void displayBusInfo(){
        System.out.println("Bus No: " + busNo +", Ac: "+ ac + ", Total Capacity: " + capacity);
    }

}
