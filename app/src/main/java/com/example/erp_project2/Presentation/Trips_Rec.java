//package com.example.erp_project2.Data;
//
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.erp_project2.R;
//
//import java.util.ArrayList;
//
//public class Trips_Rec extends RecyclerView.Adapter<Trips_Rec.Holder> implements onClickTripSearch {
//
//    ArrayList<Trip>list=new ArrayList<>();
//    private onClickTripSearch onClickTripSearch;
//
//
//    public Trips_Rec(ArrayList<Trip>list2,onClickTripSearch onClickTripSearch2){
//
//        this.list=list2;
//        this.onClickTripSearch=onClickTripSearch2;
//
//
//
//    }
//
//
//
//
//    @NonNull
//    @Override
//    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.trip_result_card,parent,false);
//        return new Holder(view) ;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Holder holder, int position) {
//        if (list != null && list.size() > position && list.get(position).getData() != null && !list.get(position).getData().isEmpty()) {
//            Trip.DataBean dataBean = list.get(position).getData().get(0);  // Getting the first DataBean
//
//            if (dataBean.getBoarding_Station() != null) {
//                holder.Point.setText(dataBean.getBoarding_Station().getStation_Name());
//            }
//
//            if (dataBean.getDestination_Station() != null) {
//                holder.Destination.setText(dataBean.getDestination_Station().getStation_Name());
//            }
//
//            holder.Price.setText(String.valueOf(dataBean.getVehicle_ID().getSeats().get(position).getSeat_Price()));  // Converting price to string
//
//            if (dataBean.getVehicle_ID() != null) {
//                holder.Vehicle_Type.setText(dataBean.getVehicle_ID().getVehicle_Type());
//                if (dataBean.getVehicle_ID().getOrganization_ID() != null) {
//                    holder.OrganizationName.setText(dataBean.getVehicle_ID().getOrganization_ID().getOrganizationName());
//                }
//            }
//
//            holder.StartTime.setText(dataBean.getTrip_Start_Date());
//            holder.EndTime.setText(dataBean.getTrip_End_Date());
//        }
//    }
//
//
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    @Override
//    public void onClick(int id) {
//
//    }
//
//    public class Holder extends RecyclerView.ViewHolder{
//
//
//        TextView Point;
//        TextView Destination;
//        TextView Vehicle_Type;
//
//        TextView OrganizationName;
//        Button Btn_Continue;
//        TextView Price;
//        TextView StartTime;
//        TextView EndTime;
//
//
//        public Holder(@NonNull View itemView) {
//            super(itemView);
//
//            Point=itemView.findViewById(R.id.Tv_Point);
//            Destination=itemView.findViewById(R.id.Tv_Destination);
//            Price=itemView.findViewById(R.id.tvPrice_Trip);
//            OrganizationName=itemView.findViewById(R.id.Tv_Company);
//            Vehicle_Type=itemView.findViewById(R.id.Tv_Vehicle_Type);
//            StartTime=itemView.findViewById(R.id.Tv_StartTime);
//            EndTime=itemView.findViewById(R.id.TV_EndTrip);
//            Btn_Continue=itemView.findViewById(R.id.Btn_Continue);
//
//            Btn_Continue.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                      onClickTripSearch.onClick(getAdapterPosition());
//                }
//            });
//
//
//        }
//    }
//}
//





package com.example.erp_project2.Presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.erp_project2.Data.Trip;
import com.example.erp_project2.R;

import java.util.ArrayList;

public class Trips_Rec extends RecyclerView.Adapter<Trips_Rec.Holder>implements com.example.erp_project2.Presentation.onClickTripSearch {

    ArrayList<Trip.DataBean> list = new ArrayList<>();
    private onClickTripSearch onClickTripSearch;

    public Trips_Rec(ArrayList<Trip.DataBean> list, onClickTripSearch onClickTripSearch) {
        this.list = list;
        this.onClickTripSearch = onClickTripSearch;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trip_result_card, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        if(!(list.size()==0)) {

            holder.Destination.setText(list.get(position).getDestination_Station().getStation_Name());
            holder.Point.setText(list.get(position).getBoarding_Station().getStation_Name());
            holder.Vehicle_Type.setText(list.get(position).getVehicle_ID().getVehicle_Type());
            holder.OrganizationName.setText(list.get(position).getVehicle_ID().getOrganization_ID().getOrganizationName());
            holder.Price.setText(String.valueOf(list.get(position).getVehicle_ID().getSeats().get(position).getSeat_Price()));
            holder.StartTime.setText(list.get(position).getTrip_Start_Date());
            holder.EndTime.setText(list.get(position).getTrip_End_Date());

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(int id) {

    }


    public class Holder extends RecyclerView.ViewHolder {

        TextView Point;
        TextView Destination;
        TextView Vehicle_Type;
        TextView OrganizationName;
        Button Btn_Continue;
        TextView Price;
        TextView StartTime;
        TextView EndTime;

        public Holder(@NonNull View itemView) {
            super(itemView);

            Point = itemView.findViewById(R.id.Tv_Point);
            Destination = itemView.findViewById(R.id.Tv_Destination);
            Price = itemView.findViewById(R.id.tvPrice_Trip);
            OrganizationName = itemView.findViewById(R.id.Tv_Company);
            Vehicle_Type = itemView.findViewById(R.id.Tv_Vehicle_Type);
            StartTime = itemView.findViewById(R.id.Tv_StartTime);
            EndTime = itemView.findViewById(R.id.TV_EndTrip);
            Btn_Continue = itemView.findViewById(R.id.Btn_Continue);

            Btn_Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickTripSearch.onClick(getAdapterPosition());
                }
            });
        }
    }

}

//

//        Trip trip = list.get(position);
//        if (trip != null && trip.getData() != null && !trip.getData().isEmpty()) {
//            Trip.DataBean dataBean = trip.getData().get(0); // Assuming you always want to show the first set of data.
//            if (dataBean != null) {
//                if (dataBean.getBoarding_Station() != null && dataBean.getBoarding_Station().getStation_Name() != null) {
//                    holder.Point.setText(dataBean.getBoarding_Station().getStation_Name());
//                }
//                if (dataBean.getDestination_Station() != null && dataBean.getDestination_Station().getStation_Name() != null) {
//                    holder.Destination.setText(dataBean.getDestination_Station().getStation_Name());
//                }
//                if (dataBean.getVehicle_ID() != null && dataBean.getVehicle_ID().getSeats() != null && !dataBean.getVehicle_ID().getSeats().isEmpty()) {
//                    // Display the price of the first seat or another logic that fits your requirement
//                    holder.Price.setText(String.valueOf(dataBean.getVehicle_ID().getSeats().get(0).getSeat_Price())); // Use first seat's price
//                }
//                if (dataBean.getVehicle_ID() != null) {
//                    holder.Vehicle_Type.setText(dataBean.getVehicle_ID().getVehicle_Name());
//                    if (dataBean.getVehicle_ID().getOrganization_ID() != null) {
//                        holder.OrganizationName.setText(dataBean.getVehicle_ID().getOrganization_ID().getOrganizationName());
//                    }
//                }
//                holder.StartTime.setText(dataBean.getTrip_Start_Date());
//                holder.EndTime.setText(dataBean.getTrip_End_Date());
//            }
//        }


