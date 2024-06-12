package com.example.erp_project2.Data;

import java.util.List;

public class Response_Stations {




    private String message;
    private DataBean data;

    @Override
    public String toString() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<StationsBean> stations;

        public List<StationsBean> getStations() {
            return stations;
        }

        public void setStations(List<StationsBean> stations) {
            this.stations = stations;
        }

    public static class StationsBean {

            private String _id;
            private int station_id;
            private String station_name;

            public String get_id() {
                return _id;
            }

        @Override
            public String toString() {
            return station_name;
        }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getStation_id() {
                return station_id;
            }

            public void setStation_id(int station_id) {
                this.station_id = station_id;
            }

            public String getStation_name() {
                return station_name;
            }

            public void setStation_name(String station_name) {
                this.station_name = station_name;
            }
        }
    }




}
