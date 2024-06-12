package com.example.erp_project2.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import com.example.erp_project2.Data.sharedPrefrence;
import com.example.erp_project2.R;
import com.example.erp_project2.databinding.FragmentCalenderBinding;

public class CalenderFragment extends Fragment {
    public FragmentCalenderBinding binding;
    public NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //"2024-6-1"
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCalenderBinding.inflate(inflater);
        navController= Navigation.findNavController(container);
        binding.calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {


                String myDate = year + "-" + (month + 1) + "-" + dayOfMonth;
               binding.TvBirthday1.setText(myDate);
                sharedPrefrence.setUserHistoryGoing(myDate);
                navController.navigate(R.id.action_calenderFragment_to_homeFragment);
            }
        });




        return binding.getRoot();
    }
}