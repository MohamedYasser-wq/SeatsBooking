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
import com.example.erp_project2.databinding.FragmentCalender2Binding;

public class Calender2Fragment extends Fragment {
    public FragmentCalender2Binding binding;
    public NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentCalender2Binding.inflate(inflater);
        navController= Navigation.findNavController(container);
        binding.calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {


                String myDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                binding.TvBirthday2.setText(myDate);
                sharedPrefrence.setUserHistoryBack(myDate);
                navController.navigate(R.id.action_calender2Fragment_to_homeFragment);
            }
        });


        return binding.getRoot();
    }
}