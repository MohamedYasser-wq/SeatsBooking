package com.example.erp_project2.Data;

import java.util.List;

public class Ticket {
    private String message;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String _id;

        private TripIDBean Trip_ID;
        private SeatNumberBean Seat_Number;
        private OrganizationIDBean Organization_ID;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

       public TripIDBean getTrip_ID() {
            return Trip_ID;
        }

        public void setTrip_ID(TripIDBean Trip_ID) {
            this.Trip_ID = Trip_ID;
        }

        public SeatNumberBean getSeat_Number() {
            return Seat_Number;
        }

        public void setSeat_Number(SeatNumberBean Seat_Number) {
            this.Seat_Number = Seat_Number;
        }

       public OrganizationIDBean getOrganization_ID() {
            return Organization_ID;
        }

        public void setOrganization_ID(OrganizationIDBean Organization_ID) {
            this.Organization_ID = Organization_ID;
        }
        public static class TripIDBean {

            private String _id;
            private BoardingStationBean Boarding_Station;
            private DestinationStationBean Destination_Station;
            private String Organization_ID;
            private String Trip_Start_Date;
            private String Trip_End_Date;
            private String Vehicle_ID;
            private String Trip_Notes;
            private int Trip_ID;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public BoardingStationBean getBoarding_Station() {
                return Boarding_Station;
            }

            public void setBoarding_Station(BoardingStationBean Boarding_Station) {
                this.Boarding_Station = Boarding_Station;
            }

            public DestinationStationBean getDestination_Station() {
                return Destination_Station;
            }

            public void setDestination_Station(DestinationStationBean Destination_Station) {
                this.Destination_Station = Destination_Station;
            }

            public String getOrganization_ID() {
                return Organization_ID;
            }

            public void setOrganization_ID(String Organization_ID) {
                this.Organization_ID = Organization_ID;
            }

            public String getTrip_Start_Date() {
                return Trip_Start_Date;
            }

            public void setTrip_Start_Date(String Trip_Start_Date) {
                this.Trip_Start_Date = Trip_Start_Date;
            }

            public String getTrip_End_Date() {
                return Trip_End_Date;
            }

            public void setTrip_End_Date(String Trip_End_Date) {
                this.Trip_End_Date = Trip_End_Date;
            }

            public String getVehicle_ID() {
                return Vehicle_ID;
            }

            public void setVehicle_ID(String Vehicle_ID) {
                this.Vehicle_ID = Vehicle_ID;
            }

            public String getTrip_Notes() {
                return Trip_Notes;
            }

            public void setTrip_Notes(String Trip_Notes) {
                this.Trip_Notes = Trip_Notes;
            }

            public int getTrip_ID() {
                return Trip_ID;
            }

            public void setTrip_ID(int Trip_ID) {
                this.Trip_ID = Trip_ID;
            }
      public static class BoardingStationBean {

                private String _id;
               private String Station_Name;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }
                public String getStation_Name() {
                    return Station_Name;
                }

                public void setStation_Name(String Station_Name) {
                    this.Station_Name = Station_Name;
                }
            }

            public static class DestinationStationBean {

                private String _id;

                private String Station_Name;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }


                public String getStation_Name() {
                    return Station_Name;
                }

                public void setStation_Name(String Station_Name) {
                    this.Station_Name = Station_Name;
                }
            }
        }

        public static class SeatNumberBean {

            private String _id;
            private String Seat_Number;
            private int Seat_Price;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getSeat_Number() {
                return Seat_Number;
            }

            public void setSeat_Number(String Seat_Number) {
                this.Seat_Number = Seat_Number;
            }

            public int getSeat_Price() {
                return Seat_Price;
            }

            public void setSeat_Price(int Seat_Price) {
                this.Seat_Price = Seat_Price;
            }
        }

        public static class OrganizationIDBean {
                private String OrganizationName;


            public String getOrganizationName() {
                return OrganizationName;
            }

            public void setOrganizationName(String OrganizationName) {
                this.OrganizationName = OrganizationName;
            }
        }
    }
}
