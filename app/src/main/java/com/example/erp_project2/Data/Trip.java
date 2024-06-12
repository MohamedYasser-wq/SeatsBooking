package com.example.erp_project2.Data;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Trip
{
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
        private BoardingStationBean Boarding_Station;
        private DestinationStationBean Destination_Station;
        private String Organization_ID;
        private String Trip_Start_Date;
        private String Trip_End_Date;
        private VehicleIDBean Vehicle_ID;
        private String Trip_Notes;
        private int Trip_ID;
        private int __v;

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

        public VehicleIDBean getVehicle_ID() {
            return Vehicle_ID;
        }

        public void setVehicle_ID(VehicleIDBean Vehicle_ID) {
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

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public static class BoardingStationBean {
            /**
             * Station_Location : {"long":"22","lat":"12"}
             * _id : 663d41aedac21807d881c2aa
             * Governorate_Name : giza
             * City_Name : giza
             * Station_Name : giza
             * Active_Station : true
             * Station_ID : 1000
             * Governorate_ID : 1
             * City_ID : 100
             * __v : 0
             */

            private StationLocationBean Station_Location;
            private String _id;
            private String Governorate_Name;
            private String City_Name;
            private String Station_Name;
            private boolean Active_Station;
            private int Station_ID;
            private int Governorate_ID;
            private int City_ID;
            private int __v;

            public StationLocationBean getStation_Location() {
                return Station_Location;
            }

            public void setStation_Location(StationLocationBean Station_Location) {
                this.Station_Location = Station_Location;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getGovernorate_Name() {
                return Governorate_Name;
            }

            public void setGovernorate_Name(String Governorate_Name) {
                this.Governorate_Name = Governorate_Name;
            }

            public String getCity_Name() {
                return City_Name;
            }

            public void setCity_Name(String City_Name) {
                this.City_Name = City_Name;
            }

            public String getStation_Name() {
                return Station_Name;
            }

            public void setStation_Name(String Station_Name) {
                this.Station_Name = Station_Name;
            }

            public boolean isActive_Station() {
                return Active_Station;
            }

            public void setActive_Station(boolean Active_Station) {
                this.Active_Station = Active_Station;
            }

            public int getStation_ID() {
                return Station_ID;
            }

            public void setStation_ID(int Station_ID) {
                this.Station_ID = Station_ID;
            }

            public int getGovernorate_ID() {
                return Governorate_ID;
            }

            public void setGovernorate_ID(int Governorate_ID) {
                this.Governorate_ID = Governorate_ID;
            }

            public int getCity_ID() {
                return City_ID;
            }

            public void setCity_ID(int City_ID) {
                this.City_ID = City_ID;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public static class StationLocationBean {
                /**
                 * long : 22
                 * lat : 12
                 */

                @SerializedName("long")
                private String longX;
                private String lat;

                public String getLongX() {
                    return longX;
                }

                public void setLongX(String longX) {
                    this.longX = longX;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }
            }
        }

        public static class DestinationStationBean {
            /**
             * Station_Location : {"long":"22","lat":"12"}
             * _id : 663d424edac21807d881c2db
             * Governorate_Name : alex
             * City_Name : meame
             * Station_Name : sede_gaber
             * Active_Station : true
             * Station_ID : 1005
             * City_ID : 105
             * Governorate_ID : 6
             * __v : 0
             */

            private StationLocationBeanX Station_Location;
            private String _id;
            private String Governorate_Name;
            private String City_Name;
            private String Station_Name;
            private boolean Active_Station;
            private int Station_ID;
            private int City_ID;
            private int Governorate_ID;
            private int __v;

            public StationLocationBeanX getStation_Location() {
                return Station_Location;
            }

            public void setStation_Location(StationLocationBeanX Station_Location) {
                this.Station_Location = Station_Location;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getGovernorate_Name() {
                return Governorate_Name;
            }

            public void setGovernorate_Name(String Governorate_Name) {
                this.Governorate_Name = Governorate_Name;
            }

            public String getCity_Name() {
                return City_Name;
            }

            public void setCity_Name(String City_Name) {
                this.City_Name = City_Name;
            }

            public String getStation_Name() {
                return Station_Name;
            }

            public void setStation_Name(String Station_Name) {
                this.Station_Name = Station_Name;
            }

            public boolean isActive_Station() {
                return Active_Station;
            }

            public void setActive_Station(boolean Active_Station) {
                this.Active_Station = Active_Station;
            }

            public int getStation_ID() {
                return Station_ID;
            }

            public void setStation_ID(int Station_ID) {
                this.Station_ID = Station_ID;
            }

            public int getCity_ID() {
                return City_ID;
            }

            public void setCity_ID(int City_ID) {
                this.City_ID = City_ID;
            }

            public int getGovernorate_ID() {
                return Governorate_ID;
            }

            public void setGovernorate_ID(int Governorate_ID) {
                this.Governorate_ID = Governorate_ID;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public static class StationLocationBeanX {
                /**
                 * long : 22
                 * lat : 12
                 */

                @SerializedName("long")
                private String longX;
                private String lat;

                public String getLongX() {
                    return longX;
                }

                public void setLongX(String longX) {
                    this.longX = longX;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }
            }
        }

        public static class VehicleIDBean {
            /**
             * _id : 66467c22ee96d9560fb51ea2
             * Organization_ID : {"_id":"663552669232f9d9e7ef0cf1","LicenceID":"license123","OrgStatus":true,"OrganizationType":"Banking","OrganizationName":"travel group","OrganizationFinancialID":"123456","FinancialLimitFrom":1000,"FinancialLimitTo":5000,"BankAccount":123456789,"dateTime":"2024-05-03T21:08:52.366Z","__v":0,"OrganizationImage":"https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg\n","OrganizationAttachments":["https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg\n","https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg\n"]}
             * Vehicle_Name : bus
             * Vehicle_Description : travel bus
             * Vehicle_Type : costar
             * Vehicle_Class : econ
             * Active_Vehicle : true
             * Vehicle_ID : 83
             * __v : 0
             * Seats : [{"_id":"66467d25fe37c7e877ccd48a","Vehicle_ID":"66467c22ee96d9560fb51ea2","Seat_Number":"seat 1","Seat_description":"seat","Seat_Price":200,"Active_Seat":true,"Status_Booked":true,"__v":0},{"_id":"66467d2afe37c7e877ccd48c","Vehicle_ID":"66467c22ee96d9560fb51ea2","Seat_Number":"seat 2","Seat_description":"seat","Seat_Price":200,"Active_Seat":true,"Status_Booked":true,"__v":0},{"_id":"66467d30fe37c7e877ccd48e","Vehicle_ID":"66467c22ee96d9560fb51ea2","Seat_Number":"seat 3","Seat_description":"seat","Seat_Price":200,"Active_Seat":true,"Status_Booked":false,"__v":0},{"_id":"66467d36fe37c7e877ccd490","Vehicle_ID":"66467c22ee96d9560fb51ea2","Seat_Number":"seat 4","Seat_description":"seat","Seat_Price":200,"Active_Seat":true,"Status_Booked":false,"__v":0},{"_id":"66467d3cfe37c7e877ccd492","Vehicle_ID":"66467c22ee96d9560fb51ea2","Seat_Number":"seat 5","Seat_description":"seat","Seat_Price":200,"Active_Seat":true,"Status_Booked":false,"__v":0}]
             */

            private String _id;
            private OrganizationIDBean Organization_ID;
            private String Vehicle_Name;
            private String Vehicle_Description;
            private String Vehicle_Type;
            private String Vehicle_Class;
            private boolean Active_Vehicle;
            private int Vehicle_ID;
            private int __v;
            private List<SeatsBean> Seats;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public OrganizationIDBean getOrganization_ID() {
                return Organization_ID;
            }

            public void setOrganization_ID(OrganizationIDBean Organization_ID) {
                this.Organization_ID = Organization_ID;
            }

            public String getVehicle_Name() {
                return Vehicle_Name;
            }

            public void setVehicle_Name(String Vehicle_Name) {
                this.Vehicle_Name = Vehicle_Name;
            }

            public String getVehicle_Description() {
                return Vehicle_Description;
            }

            public void setVehicle_Description(String Vehicle_Description) {
                this.Vehicle_Description = Vehicle_Description;
            }

            public String getVehicle_Type() {
                return Vehicle_Type;
            }

            public void setVehicle_Type(String Vehicle_Type) {
                this.Vehicle_Type = Vehicle_Type;
            }

            public String getVehicle_Class() {
                return Vehicle_Class;
            }

            public void setVehicle_Class(String Vehicle_Class) {
                this.Vehicle_Class = Vehicle_Class;
            }

            public boolean isActive_Vehicle() {
                return Active_Vehicle;
            }

            public void setActive_Vehicle(boolean Active_Vehicle) {
                this.Active_Vehicle = Active_Vehicle;
            }

            public int getVehicle_ID() {
                return Vehicle_ID;
            }

            public void setVehicle_ID(int Vehicle_ID) {
                this.Vehicle_ID = Vehicle_ID;
            }

            public int get__v() {
                return __v;
            }

            public void set__v(int __v) {
                this.__v = __v;
            }

            public List<SeatsBean> getSeats() {
                return Seats;
            }

            public void setSeats(List<SeatsBean> Seats) {
                this.Seats = Seats;
            }

            public static class OrganizationIDBean {
                /**
                 * _id : 663552669232f9d9e7ef0cf1
                 * LicenceID : license123
                 * OrgStatus : true
                 * OrganizationType : Banking
                 * OrganizationName : travel group
                 * OrganizationFinancialID : 123456
                 * FinancialLimitFrom : 1000
                 * FinancialLimitTo : 5000
                 * BankAccount : 123456789
                 * dateTime : 2024-05-03T21:08:52.366Z
                 * __v : 0
                 * OrganizationImage : https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg
                 * OrganizationAttachments : ["https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg\n","https://res.cloudinary.com/dnem3okap/image/upload/v1715604954/io2rfkohmegehdmjuree.jpg\n"]
                 */

                private String _id;
                private String LicenceID;
                private boolean OrgStatus;
                private String OrganizationType;
                private String OrganizationName;
                private String OrganizationFinancialID;
                private int FinancialLimitFrom;
                private int FinancialLimitTo;
                private int BankAccount;
                private String dateTime;
                private int __v;
                private String OrganizationImage;
                private List<String> OrganizationAttachments;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getLicenceID() {
                    return LicenceID;
                }

                public void setLicenceID(String LicenceID) {
                    this.LicenceID = LicenceID;
                }

                public boolean isOrgStatus() {
                    return OrgStatus;
                }

                public void setOrgStatus(boolean OrgStatus) {
                    this.OrgStatus = OrgStatus;
                }

                public String getOrganizationType() {
                    return OrganizationType;
                }

                public void setOrganizationType(String OrganizationType) {
                    this.OrganizationType = OrganizationType;
                }

                public String getOrganizationName() {
                    return OrganizationName;
                }

                public void setOrganizationName(String OrganizationName) {
                    this.OrganizationName = OrganizationName;
                }

                public String getOrganizationFinancialID() {
                    return OrganizationFinancialID;
                }

                public void setOrganizationFinancialID(String OrganizationFinancialID) {
                    this.OrganizationFinancialID = OrganizationFinancialID;
                }

                public int getFinancialLimitFrom() {
                    return FinancialLimitFrom;
                }

                public void setFinancialLimitFrom(int FinancialLimitFrom) {
                    this.FinancialLimitFrom = FinancialLimitFrom;
                }

                public int getFinancialLimitTo() {
                    return FinancialLimitTo;
                }

                public void setFinancialLimitTo(int FinancialLimitTo) {
                    this.FinancialLimitTo = FinancialLimitTo;
                }

                public int getBankAccount() {
                    return BankAccount;
                }

                public void setBankAccount(int BankAccount) {
                    this.BankAccount = BankAccount;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public int get__v() {
                    return __v;
                }

                public void set__v(int __v) {
                    this.__v = __v;
                }

                public String getOrganizationImage() {
                    return OrganizationImage;
                }

                public void setOrganizationImage(String OrganizationImage) {
                    this.OrganizationImage = OrganizationImage;
                }

                public List<String> getOrganizationAttachments() {
                    return OrganizationAttachments;
                }

                public void setOrganizationAttachments(List<String> OrganizationAttachments) {
                    this.OrganizationAttachments = OrganizationAttachments;
                }
            }

            public static class SeatsBean {
                /**
                 * _id : 66467d25fe37c7e877ccd48a
                 * Vehicle_ID : 66467c22ee96d9560fb51ea2
                 * Seat_Number : seat 1
                 * Seat_description : seat
                 * Seat_Price : 200
                 * Active_Seat : true
                 * Status_Booked : true
                 * __v : 0
                 */

                private String _id;
                private String Vehicle_ID;
                private String Seat_Number;
                private String Seat_description;
                private int Seat_Price;
                private boolean Active_Seat;
                private boolean Status_Booked;
                private int __v;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getVehicle_ID() {
                    return Vehicle_ID;
                }

                public void setVehicle_ID(String Vehicle_ID) {
                    this.Vehicle_ID = Vehicle_ID;
                }

                public String getSeat_Number() {
                    return Seat_Number;
                }

                public void setSeat_Number(String Seat_Number) {
                    this.Seat_Number = Seat_Number;
                }

                public String getSeat_description() {
                    return Seat_description;
                }

                public void setSeat_description(String Seat_description) {
                    this.Seat_description = Seat_description;
                }

                public int getSeat_Price() {
                    return Seat_Price;
                }

                public void setSeat_Price(int Seat_Price) {
                    this.Seat_Price = Seat_Price;
                }

                public boolean isActive_Seat() {
                    return Active_Seat;
                }

                public void setActive_Seat(boolean Active_Seat) {
                    this.Active_Seat = Active_Seat;
                }

                public boolean isStatus_Booked() {
                    return Status_Booked;
                }

                public void setStatus_Booked(boolean Status_Booked) {
                    this.Status_Booked = Status_Booked;
                }

                public int get__v() {
                    return __v;
                }

                public void set__v(int __v) {
                    this.__v = __v;
                }
            }
        }
    }
}
