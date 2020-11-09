package com.example.guidemilling.toolGallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guidemilling.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem>arrayList;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textName;
        public TextView textAbout;


        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.tool_image);
            textName=itemView.findViewById(R.id.tv_name);
            textAbout=itemView.findViewById(R.id.tv_about);

        }
    }

    public  RecyclerViewAdapter(ArrayList<RecyclerViewItem>arrayList){
        this.arrayList=arrayList;
    }


    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
       RecyclerViewViewHolder recyclerViewViewHolder=new RecyclerViewViewHolder(view);
       return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItem recyclerViewItem =arrayList.get(position);
        holder.imageView.setImageResource(recyclerViewItem.getImageTool());
        holder.textName.setText(recyclerViewItem.getName());
        holder.textAbout.setText(recyclerViewItem.getAbout());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
