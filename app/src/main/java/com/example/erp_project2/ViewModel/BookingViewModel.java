package com.example.erp_project2.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.erp_project2.Data.CreateTicket;
import com.example.erp_project2.Data.StationMix;
import com.example.erp_project2.Data.Ticket;
import com.example.erp_project2.Data.Trip;
import com.example.erp_project2.Data.searchTrip;

import java.util.ArrayList;

public class BookingViewModel extends ViewModel {


   public MutableLiveData<ArrayList<StationMix>>GetStationLiveData=new MutableLiveData<>();
   public MutableLiveData<String>ErrorGetStationLiveData=new MutableLiveData<>();

    public MutableLiveData<ArrayList<Trip.DataBean>>GetAllAvailableTripsLiveData=new MutableLiveData<>();
    public MutableLiveData<String>ErrorAllAvailableTripsLiveData=new MutableLiveData<>();

    public MutableLiveData<Ticket>CreateTicketLiveData=new MutableLiveData<>();
    public MutableLiveData<String>ErrorCreateTicketLiveData=new MutableLiveData<>();


    public MutableLiveData<Boolean>DeleteTicketLiveData=new MutableLiveData<>();
    public MutableLiveData<String>ErrorDeleteTicketLiveData=new MutableLiveData<>();
   private BookingHelper bookingHelper;

    public BookingViewModel(){

        bookingHelper=new BookingHelper();


    }

    public void GetAllStation(){

 bookingHelper.GetAllStation(new BookingHelper.StationCallBack() {
     @Override
     public void Success(ArrayList<StationMix> list) {
         if (!(list.size() == 0))
         {

             GetStationLiveData.setValue(list);
         }
     }

     @Override
     public void Failure(int size, String error) {
         if (size==0)
         {

             ErrorGetStationLiveData.setValue(error);
         }
     }
 });

    }


    public void GetAllAvailableTrips(searchTrip searchTrip1){

        bookingHelper.GetAllTrips(searchTrip1, new BookingHelper.TripCallBack() {
            @Override
            public void Success(ArrayList<Trip.DataBean> list) {
                if (!(list.size() == 0)) {
                    GetAllAvailableTripsLiveData.setValue(list);
                }
                else
                    return;
            }

            @Override
            public void Failure(String error) {
               ErrorAllAvailableTripsLiveData.setValue(error);
            }
        });



    }

    public void CreateTicket(CreateTicket createTicket){
        bookingHelper.CreateTicket(createTicket, new BookingHelper.CreateTicketCallBack() {
            @Override
            public void Success(Ticket ticket) {
                if(!(ticket.getData().size()==0)){

                    CreateTicketLiveData.setValue(ticket);

                }
                else
                    return;
            }

            @Override
            public void Failure(int size, String error) {
                if(size==0)
                    ErrorCreateTicketLiveData.setValue(error);
            }
        });


    }

    public void DeleteTicket(String _id){

        bookingHelper.DeleteTicket(_id, new BookingHelper.DeleteTicketCallBack() {
            @Override
            public void Success() {
                 DeleteTicketLiveData.setValue(true);
            }

            @Override
            public void Failure(String error) {
                ErrorDeleteTicketLiveData.setValue(error);

            }
        });


    }



}
