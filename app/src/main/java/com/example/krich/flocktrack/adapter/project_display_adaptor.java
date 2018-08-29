package com.example.krich.flocktrack.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
import android.widget.TextView;

import com.example.krich.flocktrack.R;
import com.example.krich.flocktrack.dash;

import java.util.List;

public class project_display_adaptor extends RecyclerView.Adapter<project_display_adaptor.ViewHolder> {
    private List<dash> list_data;
    private Context context;

    public project_display_adaptor(Context context,List<dash> list_data) {
        this.list_data = list_data;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_display_adaptor,
                parent, false);
        Log.e(project_display_adaptor.class.getSimpleName(), "" + list_data);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        dash listData = list_data.get(position);
        holder.txtname.setText(listData.getAdults());
        holder.txtmovie.setText(listData.getChildren());
        holder.txtmovi.setText(listData.getOfferings());
    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtname, txtmovie, txtmovi;

        public ViewHolder(View itemView) {
            super(itemView);
            txtname =  itemView.findViewById(R.id.attendance);
            txtmovie =  itemView.findViewById(R.id.children);
            txtmovi =  itemView.findViewById(R.id.offerings);
        }
    }
}
