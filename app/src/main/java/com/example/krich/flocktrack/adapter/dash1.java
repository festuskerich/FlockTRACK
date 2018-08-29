package com.example.krich.flocktrack.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.krich.flocktrack.R;
import com.example.krich.flocktrack.dash;

import java.util.List;

public class dash1  extends RecyclerView.Adapter<dash1.ProductViewHolder> {

    private Context mCtx;
    private List<dash> list_data;



    public dash1(List<dash> list_data) {
        this.list_data =list_data;


    }


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        dash product = list_data.get(position);

        holder.textViewTitle.setText(product.getAdults());
        holder.textViewShortDesc.setText(product.getChildren());
        holder.textViewRating.setText(String.valueOf(product.getOfferings()));

    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.adults);
            textViewShortDesc = itemView.findViewById(R.id.children);
            textViewRating = itemView.findViewById(R.id.offerings);

        }
    }


}
