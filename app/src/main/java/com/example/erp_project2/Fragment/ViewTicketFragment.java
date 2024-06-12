package com.example.erp_project2.Fragment;

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

import com.example.erp_project2.Data.CreateTicket;
import com.example.erp_project2.Data.Ticket;
import com.example.erp_project2.Presentation.Ticket_Rec;
import com.example.erp_project2.Presentation.onClickTripSearch;
import com.example.erp_project2.Data.sharedPrefrence;

import com.example.erp_project2.R;
import com.example.erp_project2.ViewModel.BookingViewModel;
import com.example.erp_project2.databinding.FragmentViewTicketBinding;

public class ViewTicketFragment extends Fragment implements onClickTripSearch {
    private FragmentViewTicketBinding binding;
    private NavController navController;
    private Ticket_Rec ticketRec;
    public Ticket list = new Ticket();
    private BookingViewModel bookingViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentViewTicketBinding.inflate(inflater, container, false);
        navController = Navigation.findNavController(container);
        bookingViewModel = new ViewModelProvider(this).get(BookingViewModel.class);

        binding.BtnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_viewTicketFragment_to_homeFragment);
            }
        });

        binding.BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(list.getData().size()==0)){
                    Toast.makeText(getActivity(), "Please Delete All Ticket First Then Back To Set Number Of Ticket", Toast.LENGTH_SHORT).show();
                }
                else {
                    navController.navigate(R.id.action_viewTicketFragment_to_ticketFragment);
                }
            }
        });

        SetData();
        return binding.getRoot();
    }

    public void SetData() {
        String pnr = "555";
        String name = "Yasser";
        String NationalId = "12345678901234";
        String id = sharedPrefrence.GetTripId();
        String Phone = "01120772322";
        String NumOfTicket = sharedPrefrence.GetNumOf_Ticket();

        CreateTicket createTicket = new CreateTicket(pnr, id, NumOfTicket, name, Phone, NationalId);
        GetTicket(createTicket);
    }

    public void GetTicket(CreateTicket ticket) {
        bookingViewModel.CreateTicket(ticket);
        bookingViewModel.CreateTicketLiveData.observe(getViewLifecycleOwner(), new Observer<Ticket>() {
            @Override
            public void onChanged(Ticket ticket) {
                if (!(ticket.getData().size()==0)) {


                    list.setData(ticket.getData());
                    SetAdapter();
                }
                else
                {

                    Toast.makeText(getActivity(), "No Available Seats", Toast.LENGTH_SHORT).show();
                    binding.message.setVisibility(View.VISIBLE);
                }
            }
        });

        bookingViewModel.ErrorCreateTicketLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void SetAdapter() {

            ticketRec = new Ticket_Rec(list, ViewTicketFragment.this);
            binding.RecyclerTicket.setAdapter(ticketRec);

    }

    @Override
    public void onClick(int position) {
        String _id = list.getData().get(position).get_id();
        bookingViewModel.DeleteTicket(_id);
        bookingViewModel.DeleteTicketLiveData.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if (aBoolean) {

                    list.getData().remove(position);
                    SetAdapter();

                }
            }
        });
        bookingViewModel.ErrorDeleteTicketLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
