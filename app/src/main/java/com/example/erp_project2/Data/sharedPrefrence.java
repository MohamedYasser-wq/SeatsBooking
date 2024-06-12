package com.example.erp_project2.Data;

import android.content.Context;
import android.content.SharedPreferences;

public class sharedPrefrence {
    private static final String PREF_NAME = "UserPreferences";
    private static final String KEY_USER_HISTORY_GOING = "UserHistoryGoing";
    private static final String KEY_USER_HISTORY_BACK = "UserHistoryBack";
    private static final String KEY_USER_STARTING_POINT = "UserStartingPoint";
    private static final String KEY_USER_DEST_POINT = "UserDestPoint";

    private static final String KEY_Station_Point_Id = "Station_Point_Id";

    private static final String KEY_Station_Destination_Id = "Station_Dest_Id";

    private static final String KEY_OrganizationName = "OrganizationName";
    private static final String KEY_NumOf_Ticket = "NumOf_Ticket";
    private static final String KEY_Price = "price";
    private static final String KEY_Trip_Type = "Trip_Type";
    private static final String KEY_Trip_Id = "Trip_Id";
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;


    public static void init(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            editor = sharedPreferences.edit();
        }
    }

    public static void setUserHistoryGoing(String date) {
        editor.putString(KEY_USER_HISTORY_GOING, date).apply();
    }

    public static String getUserHistoryGoing() {
        return sharedPreferences.getString(KEY_USER_HISTORY_GOING, "");
    }

    public static void setUserHistoryBack(String date) {
        editor.putString(KEY_USER_HISTORY_BACK, date).apply();
    }

    public static String getUserHistoryBack() {
        return sharedPreferences.getString(KEY_USER_HISTORY_BACK, "");
    }

    public static void setUserStartingPoint(String startingPoint) {
        editor.putString(KEY_USER_STARTING_POINT, startingPoint).apply();
    }

    public static String getUserStartingPoint() {
        return sharedPreferences.getString(KEY_USER_STARTING_POINT, "");
    }

    public static void setUserDestPoint(String destPoint) {
        editor.putString(KEY_USER_DEST_POINT, destPoint).apply();
    }

    public static String getUserDestPoint() {
        return sharedPreferences.getString(KEY_USER_DEST_POINT, "");
    }

    public static void setStationPointId(String Id) {
        editor.putString(KEY_Station_Point_Id, Id).apply();
    }

    public static String GetStationPointId() {
        return sharedPreferences.getString(KEY_Station_Point_Id, "");
    }



    public static void setStationDestId(String Id) {
        editor.putString(KEY_Station_Destination_Id, Id).apply();
    }

    public static String GetStationDestId() {
        return sharedPreferences.getString(KEY_Station_Destination_Id, "");
    }



    public static void setTripId(String Id) {
        editor.putString(KEY_Station_Destination_Id,Id).apply();
    }

    public static String GetTripId() {
        return sharedPreferences.getString(KEY_Station_Destination_Id, "");
    }



    public static void setOrganizationName(String name) {
        editor.putString(KEY_OrganizationName, name).apply();
    }

    public static String GetOrganizationNameId() {
        return sharedPreferences.getString(KEY_OrganizationName, "");
    }



    public static void setTrip_Type(String name) {
        editor.putString(KEY_Trip_Type, name).apply();
    }

    public static String GetTrip_Type() {
        return sharedPreferences.getString(KEY_Trip_Type, "");
    }


    public static void setNumOf_Ticket(String NumOfTicket) {
        editor.putString(KEY_NumOf_Ticket, NumOfTicket).apply();
    }

    public static String GetNumOf_Ticket() {
        return sharedPreferences.getString(KEY_NumOf_Ticket, "");
    }


    public static void setPrice(int price) {
        editor.putString(KEY_Price, String.valueOf(price)).apply();
    }

    public static String GetPrice() {
        return sharedPreferences.getString(KEY_Price, "");
    }



















}
