package com.example.erp_project2.ViewModel;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.erp_project2.Api.RetroConnection;
import com.example.erp_project2.Api.RetroConnection2;
import com.example.erp_project2.Data.CreateTicket;
import com.example.erp_project2.Data.Response_Stations;
import com.example.erp_project2.Data.StationMix;
import com.example.erp_project2.Data.Ticket;
import com.example.erp_project2.Data.Trip;
import com.example.erp_project2.Data.searchTrip;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingHelper {

    public interface StationCallBack{

        void Success(ArrayList<StationMix>list);
        void Failure(int size,String error);

    }

    public interface CreateTicketCallBack{

        void Success(Ticket ticket);
        void Failure(int size,String error);

    }

    public interface TripCallBack{

        void Success(ArrayList<Trip.DataBean>list);
        void Failure(String error);

    }

    public interface DeleteTicketCallBack{

        void Success();
        void Failure(String error);

    }



    public void GetAllStation(StationCallBack stationCallBack) {

        ArrayList<StationMix>list=new ArrayList<>();

        RetroConnection.getInst().getAllStations().enqueue(new Callback<Response_Stations>() {
            @Override
            public void onResponse(Call<Response_Stations> call, Response<Response_Stations> response) {
                if (response.isSuccessful()) {


                    list.add(new StationMix("", ""));
                    // Populate stationNames with actual data from the response
                    for (int i = 0; i < response.body().getData().getStations().size(); i++) {
                        String id = response.body().getData().getStations().get(i).get_id();
                        String name = response.body().getData().getStations().get(i).getStation_name();
                        list.add(new StationMix(id, name));
                    }

                    stationCallBack.Success(list);
                }
            }

            @Override
            public void onFailure(Call<Response_Stations> call, Throwable t) {

                stationCallBack.Failure(list.size(),"Check Network");
            }
        });
    }

    public void GetAllTrips(searchTrip searchTrip1, TripCallBack tripCallBack){

        ArrayList<Trip.DataBean>list=new ArrayList<>();

        RetroConnection.getInst().searchTrips(searchTrip1)
                .enqueue(new Callback<Trip>() {
                    @Override
                    public void onResponse(Call<Trip> call, Response<Trip> response) {


                           list.addAll(response.body().getData());
                           tripCallBack.Success(list);


                    }

                    @Override
                    public void onFailure(Call<Trip> call, Throwable t) {
                        tripCallBack.Failure("Check Network");
                    }
                });



    }


    public void CreateTicket(CreateTicket ticket,CreateTicketCallBack callBack){

        Ticket ticket1=new Ticket();

        RetroConnection2.getApiService().CreateTicket(ticket).enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                if (response.isSuccessful() && response.body() != null && response.body().getData() != null) {

                    ticket1.setData(response.body().getData());
                    callBack.Success(ticket1);

                } else
                {
                    Log.e("TAG", "onResponse: body is Empty");
                }

            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {
                callBack.Failure(ticket1.getData().size(),"Check Network");
            }

        });


    }

    public void DeleteTicket(String _id,DeleteTicketCallBack callBack){

        RetroConnection2.getApiService().DeleteTicket(_id).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {

                 if(response.code()==200&&response.isSuccessful()){

                     callBack.Success();

                 }
                 else
                     Log.e("TAG", "onResponse: :::::::"+response.message());

            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

             callBack.Failure("Check Network");
            }
        });
    }


}
