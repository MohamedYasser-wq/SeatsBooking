package com.example.erp_project2.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import com.example.erp_project2.Data.sharedPrefrence;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.erp_project2.R;
import com.example.erp_project2.databinding.FragmentTicketBinding;

public class TicketFragment extends Fragment {
    FragmentTicketBinding binding;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentTicketBinding.inflate(inflater);
        navController = Navigation.findNavController(container);

        SetData();


        binding.BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_ticketFragment_to_detailFragment);
            }
        });
        binding.BtnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_ticketFragment_to_homeFragment);

            }
        });

        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Validate();
            }
        });




        return binding.getRoot();
    }
    public void Validate(){
        String NumOfTicket=binding.edtNumOfTicket.getText().toString();

        if(NumOfTicket.equals(""))
        {
            Toast.makeText(getActivity(), "PleaseEnter Number of Ticket", Toast.LENGTH_SHORT).show();
        }
        else
        {
            sharedPrefrence.setNumOf_Ticket(NumOfTicket);
            navController.navigate(R.id.action_ticketFragment_to_viewTicketFragment);
        }

    }



    public void SetData(){

        binding.TvPoint.setText(sharedPrefrence.getUserStartingPoint());
        binding.TvDestination.setText(sharedPrefrence.getUserDestPoint());
        binding.TvStartTime.setText(sharedPrefrence.getUserHistoryGoing());
        binding.TvEndTime.setText(sharedPrefrence.getUserHistoryBack());

        binding.TvCompany.setText(sharedPrefrence.GetOrganizationNameId());
        binding.tvPriceTrip.setText(sharedPrefrence.GetPrice());
        binding.tvNumStops.setText(sharedPrefrence.GetTrip_Type());
        binding.textView5.setText(sharedPrefrence.GetPrice());

    }


}