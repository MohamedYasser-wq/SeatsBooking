package com.example.erp_project2.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.erp_project2.Data.sharedPrefrence;
import com.example.erp_project2.R;
import com.example.erp_project2.databinding.FragmentSplashBinding;

public class SplashFragment extends Fragment {

    public NavController navController;
    public FragmentSplashBinding binding;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        navController= Navigation.findNavController(container);
        binding=FragmentSplashBinding.inflate(inflater);


        binding.BtnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                navController.navigate(R.id.action_splashFragment_to_homeFragment);
            }
        });


        return binding.getRoot();

    }
}