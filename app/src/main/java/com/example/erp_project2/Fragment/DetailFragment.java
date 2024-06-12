package com.example.erp_project2.Fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.erp_project2.Api.RetroConnection;

import com.example.erp_project2.Data.Trip;
import com.example.erp_project2.Presentation.Trips_Rec;
import com.example.erp_project2.Presentation.onClickTripSearch;
import com.example.erp_project2.Data.searchTrip;
import com.example.erp_project2.Data.sharedPrefrence;
import com.example.erp_project2.R;
import com.example.erp_project2.ViewModel.BookingViewModel;
import com.example.erp_project2.databinding.FragmentDetailBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailFragment extends Fragment implements onClickTripSearch{
    private FragmentDetailBinding binding;
    private NavController navController;
    private ArrayList<Trip.DataBean>list=new ArrayList<>();
   private Trips_Rec tripsRec;
    private BookingViewModel bookingViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater);
        navController = Navigation.findNavController(container);
        bookingViewModel=new ViewModelProvider(this).get(BookingViewModel.class);


        binding.BtnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_detailFragment_to_homeFragment);

            }
        });


        setData();

        String startId=sharedPrefrence.GetStationPointId();
        String DestId=sharedPrefrence.GetStationDestId();
        String Date=sharedPrefrence.getUserHistoryGoing();


        searchTrip request = new searchTrip(startId,DestId,Date);
        searchTrip(request);
        return binding.getRoot();

    }

    private void setData() {
        binding.TVPointStart.setText(sharedPrefrence.getUserStartingPoint());
        binding.TVPointDestination.setText(sharedPrefrence.getUserDestPoint());
        binding.TVDatePickerActions.setText(sharedPrefrence.getUserHistoryGoing());
    }

    private void searchTrip(searchTrip request) {
        bookingViewModel.GetAllAvailableTrips(request);

        bookingViewModel.GetAllAvailableTripsLiveData.observe(getViewLifecycleOwner(), new Observer<ArrayList<Trip.DataBean>>() {
            @Override
            public void onChanged(ArrayList<Trip.DataBean> dataBeans) {

                if (dataBeans.size() == 0)
                {
                    binding.TvAvalibility.setVisibility(View.VISIBLE);
                }
                else
                {

                    list.addAll(dataBeans);
                    SetAdapter(list);
                }

    }
        });
        bookingViewModel.ErrorAllAvailableTripsLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void SetAdapter(ArrayList<Trip.DataBean> list) {
        tripsRec = new Trips_Rec(list,DetailFragment.this);
        binding.RecResult.setAdapter(tripsRec);
    }

    @Override
    public void onClick(int id) {

        if (list.size()==0)
        {
            return;
        }
        else {

            sharedPrefrence.setUserDestPoint(list.get(id).getDestination_Station().getStation_Name());

            sharedPrefrence.setUserHistoryBack(list.get(id).getTrip_End_Date());

            sharedPrefrence.setOrganizationName(list.get(id).getVehicle_ID().getOrganization_ID().getOrganizationName());

            sharedPrefrence.setUserStartingPoint(list.get(id).getBoarding_Station().getStation_Name());

            sharedPrefrence.setUserHistoryGoing(list.get(id).getTrip_Start_Date());

            sharedPrefrence.setTripId(list.get(id).get_id());

            sharedPrefrence.setPrice(list.get(id).getVehicle_ID().getSeats().get(id).getSeat_Price());

            sharedPrefrence.setTrip_Type(list.get(id).getVehicle_ID().getVehicle_Type());

            navController.navigate(R.id.action_detailFragment_to_ticketFragment);

        }






    }

}

