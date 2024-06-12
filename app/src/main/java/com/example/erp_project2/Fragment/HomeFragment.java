
package com.example.erp_project2.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.erp_project2.Api.RetroConnection;
import com.example.erp_project2.Data.StationMix;
import com.example.erp_project2.Data.Response_Stations;
import com.example.erp_project2.Data.sharedPrefrence;
import com.example.erp_project2.R;
import com.example.erp_project2.ViewModel.BookingViewModel;
import com.example.erp_project2.databinding.FragmentHomeBinding;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    ArrayList<StationMix> stationNames = new ArrayList<>();

    private FragmentHomeBinding binding;
    private NavController navController;
   private BookingViewModel bookingViewModel;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        navController = Navigation.findNavController(container);
        bookingViewModel =new ViewModelProvider(this).get(BookingViewModel.class);




               SetData();



        binding.StartSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!stationNames.isEmpty() && stationNames.size() > position) {
                    String selectedItem = parent.getItemAtPosition(position).toString();
                    binding.EdtStartingPoint.setText(selectedItem);
                    sharedPrefrence.setStationPointId(stationNames.get(position).get_id());
                    sharedPrefrence.setUserStartingPoint(selectedItem);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });


        binding.DestSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!stationNames.isEmpty() && stationNames.size() > position) {
                    String selectedItem = parent.getItemAtPosition(position).toString();
                    sharedPrefrence.setStationDestId(stationNames.get(position).get_id());
                    binding.EdtDestinationPoint.setText(selectedItem);
                    sharedPrefrence.setUserDestPoint(selectedItem);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        binding.SearchButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           Validate();

           }
       });



        binding.TvStartDate.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_calenderFragment));

        return binding.getRoot();
    }

    private void SetData(){
        binding.TvStartDate.setText(sharedPrefrence.getUserHistoryGoing());
        binding.EdtStartingPoint.setText(sharedPrefrence.getUserStartingPoint());
        binding.EdtDestinationPoint.setText(sharedPrefrence.getUserDestPoint());


    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fetchStations();

    }

    private void fetchStations() {

        ArrayList<String>StationName=new ArrayList<>();

      bookingViewModel.GetAllStation();

       bookingViewModel.GetStationLiveData.observe(getViewLifecycleOwner(), new Observer<ArrayList<StationMix>>() {
           @Override
           public void onChanged(ArrayList<StationMix> stationMixes) {


                   for (int i = 0; i < stationMixes.size(); i++) {
                       StationName.add(stationMixes.get(i).getStationName());
                       stationNames.addAll(stationMixes);


                   updateSpinners(StationName);
               }
           }
       });

       bookingViewModel.ErrorGetStationLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
           @Override
           public void onChanged(String s) {
               Toast.makeText(getActivity(), "Cant Find Stations", Toast.LENGTH_SHORT).show();
           }
       });


    }
    private  void Validate(){

        if(binding.EdtDestinationPoint.getText().toString().equals("")||
           binding.EdtStartingPoint.getText().toString().equals("")||
           binding.TvStartDate.getText().toString().equals("")){
            Toast.makeText(getActivity(), "Please Enter All Fields", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(binding.EdtStartingPoint.getText().toString().equals(binding.EdtDestinationPoint.getText().toString())){

                Toast.makeText(getActivity(), "Start point Cant Be Destination Point", Toast.LENGTH_SHORT).show();
            }
            else {
            SaveData();
                 }
        }

    }

    private void SaveData() {


            sharedPrefrence.setUserDestPoint(binding.EdtDestinationPoint.getText().toString());
            sharedPrefrence.setUserStartingPoint(binding.EdtStartingPoint.getText().toString());
            sharedPrefrence.setUserHistoryGoing(binding.TvStartDate.getText().toString());
            navController.navigate(R.id.action_homeFragment_to_detailFragment);


    }

    private void updateSpinners(List<String> stations){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, stations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.StartSpinner.setAdapter(adapter);
        binding.DestSpinner.setAdapter(adapter);
    }
}
