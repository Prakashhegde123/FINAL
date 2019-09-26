package com.example.project;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeListAdapter extends RecyclerView.Adapter<CoffeeListAdapter.ViewHolder> {
    ArrayList<Coffee> list = new ArrayList<>();
    listListener listener;

    public CoffeeListAdapter(ArrayList<Coffee> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.coffee_card_horizontal,viewGroup,false);
        return new ViewHolder(v);
    }

    interface listListener {
        void onClick(int position);
    }

    public void setListListener(listListener listener) {
        this.listener = listener;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {
        CardView cardView = viewHolder.coffeeCard;
        viewHolder.coffeeImage.setImageResource(list.get(i).getCoffeeImage());
        viewHolder.coffeeTitle.setText(list.get(i).getCoffeeName());
        viewHolder.coffeeDescription.setText(list.get(i).getCoffeeDescription());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(i);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView coffeeImage;
        private TextView coffeeTitle;
        private TextView coffeeDescription;
        private CardView coffeeCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            coffeeCard = itemView.findViewById(R.id.coffee_card_view_horizontal);
            coffeeImage = itemView.findViewById(R.id.coffee_card_horizontal_image_view);
            coffeeTitle = itemView.findViewById(R.id.coffee_title_horizontal);
            coffeeDescription = itemView.findViewById(R.id.coffee_description_horizontal);
        }
    }
}
