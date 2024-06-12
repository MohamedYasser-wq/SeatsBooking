package com.example.erp_project2.Data;

public class searchTrip {
    private String from;
    private String to;
    private String date;

    public String getFrom() {
        return from;
    }

    public searchTrip(String from, String to, String date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
