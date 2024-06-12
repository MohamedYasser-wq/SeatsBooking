package com.example.erp_project2.Data;

public class StationMix {


    private String _id;
    private String StationName;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public StationMix(String _id, String stationName) {
        this._id = _id;
        StationName = stationName;
    }
}
