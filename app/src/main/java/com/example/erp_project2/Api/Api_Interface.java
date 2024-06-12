package com.example.erp_project2.Api;



import com.example.erp_project2.Data.CreateTicket;
import com.example.erp_project2.Data.Response_Stations;
import com.example.erp_project2.Data.StationMix;
import com.example.erp_project2.Data.Ticket;
import com.example.erp_project2.Data.Trip;
import com.example.erp_project2.Data.searchTrip;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api_Interface {


    @GET("stations")
    Call<Response_Stations> getAllStations();

    @POST("trips/search")
    Call<Trip> searchTrips(@Body searchTrip searchRequest);

    @POST("ticket")
    Call<Ticket> CreateTicket(@Body CreateTicket ticket);

//    @POST("ticket")
//    Call<Ticket> CreateTicket(@Body CreateTicket ticket);

    @DELETE("/ticket/{id}")
    Call<Void>DeleteTicket(@Path("id") String id);



}

