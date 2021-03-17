public class Booking {

    private int nightsBooked;
    private Bedroom bedroom1;

    public Booking (int nightsBooked){
        this.nightsBooked = nightsBooked;
        this.bedroom1 = new Bedroom(1, 2, "Double", 49.99);
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }

    public double calculateTotalBill(){
        return getNightsBooked() * bedroom1.getNightlyRate();
    }

    public double getTotalBill(){
        return calculateTotalBill();
    }
}
