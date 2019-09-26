package com.example.project;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {
    ArrayList<Coffee> mList = new ArrayList<>();
    Listener listener;

    public CoffeeAdapter(ArrayList<Coffee> mList) {
        this.mList = mList;
    }

    interface Listener {
        void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.coffee_card, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        CardView cardView = viewHolder.cardView;
        viewHolder.coffeeImage.setImageResource(mList.get(i).getCoffeeImage());
        viewHolder.coffeeName.setText(mList.get(i).getCoffeeName());
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
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView coffeeName;
        private ImageView coffeeImage;
        private CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            coffeeName = itemView.findViewById(R.id.coffee_card_text_view);
            coffeeImage = itemView.findViewById(R.id.coffee_card_image_view);
            cardView = itemView.findViewById(R.id.coffee_card_view);
        }
    }
}
