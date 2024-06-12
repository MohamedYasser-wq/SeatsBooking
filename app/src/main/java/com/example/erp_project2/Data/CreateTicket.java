package com.example.erp_project2.Data;

public class CreateTicket {

    public CreateTicket(String PNR, String trip_ID, String seats_Count, String passenger_Name, String passenger_Mobile_Number, String passenger_National_ID) {
        this.PNR = PNR;
        this.Trip_ID = trip_ID;
       this.Seats_Count = seats_Count;
       this.Passenger_Name = passenger_Name;
        this.Passenger_Mobile_Number = passenger_Mobile_Number;
       this. Passenger_National_ID = passenger_National_ID;
    }

    private String PNR;
    private String Trip_ID;
    private String Seats_Count;
    private String Passenger_Name;
    private String Passenger_Mobile_Number;
    private String Passenger_National_ID;

    public String getPNR() {
        return PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public String getTrip_ID() {
        return Trip_ID;
    }

    public void setTrip_ID(String Trip_ID) {
        this.Trip_ID = Trip_ID;
    }

    public String getSeats_Count() {
        return Seats_Count;
    }

    public void setSeats_Count(String Seats_Count) {
        this.Seats_Count = Seats_Count;
    }

    public String getPassenger_Name() {
        return Passenger_Name;
    }

    public void setPassenger_Name(String Passenger_Name) {
        this.Passenger_Name = Passenger_Name;
    }

    public String getPassenger_Mobile_Number() {
        return Passenger_Mobile_Number;
    }

    public void setPassenger_Mobile_Number(String Passenger_Mobile_Number) {
        this.Passenger_Mobile_Number = Passenger_Mobile_Number;
    }

    public String getPassenger_National_ID() {
        return Passenger_National_ID;
    }

    public void setPassenger_National_ID(String Passenger_National_ID) {
        this.Passenger_National_ID = Passenger_National_ID;
    }
}
