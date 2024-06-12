package com.example.erp_project2.Presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.erp_project2.Data.Ticket;
import com.example.erp_project2.R;

public class Ticket_Rec extends RecyclerView.Adapter<Ticket_Rec.Holder> {

    Ticket list;
    private com.example.erp_project2.Presentation.onClickTripSearch onClickTripSearch;

    public Ticket_Rec(Ticket list, onClickTripSearch onClickTripSearch) {
        this.list = list;
        this.onClickTripSearch = onClickTripSearch;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ticket_result_card, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {


        holder.StartPoint.setText(list.getData().get(position).getTrip_ID().getBoarding_Station().getStation_Name());
        holder.EndPoint.setText(list.getData().get(position).getTrip_ID().getDestination_Station().getStation_Name());


        holder.StartDate.setText(list.getData().get(position).getTrip_ID().getTrip_Start_Date());
        holder.EndDate.setText(list.getData().get(position).getTrip_ID().getTrip_End_Date());
        holder.organization.setText(list.getData().get(position).getOrganization_ID().getOrganizationName());

        holder.Price.setText(String.valueOf(list.getData().get(position).getSeat_Number().getSeat_Price()));
        holder.VehicleType.setText(list.getData().get(position).getSeat_Number().getSeat_Number());

    }

    @Override
    public int getItemCount() {
        return list.getData().size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView StartPoint;
        TextView EndPoint;
        TextView StartDate;
        TextView EndDate;
        TextView VehicleType;
        TextView Price;
        TextView organization;
        Button Delete;

        public Holder(@NonNull View itemView) {
            super(itemView);
            StartPoint = itemView.findViewById(R.id.Tv_TicketPoint);
            EndPoint = itemView.findViewById(R.id.Tv_TicketDestination);
            StartDate = itemView.findViewById(R.id.Tv_TicketStartTime);
            EndDate = itemView.findViewById(R.id.TV_TicketEndTrip);
            Price = itemView.findViewById(R.id.Tv_Price);
            VehicleType = itemView.findViewById(R.id.Tv_TicketVehicle_Type);
            organization = itemView.findViewById(R.id.Tv_TicketCompany);
            Delete = itemView.findViewById(R.id.Btn_Delete);

            Delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onClickTripSearch != null) {
                        onClickTripSearch.onClick(getAdapterPosition());
                    }
                }
            });
        }
    }
}
