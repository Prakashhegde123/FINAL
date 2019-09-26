package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Alcohol coffee",R.drawable.alcohol,"Rough coffee drinks"));
        coffees.add(new Coffee("Coffee Cocktails",R.drawable.cocktail,"Unusual coffee drinks"));
        coffees.add(new Coffee("Cold coffee",R.drawable.cold,"Refreshing coffee drinks"));
        coffees.add(new Coffee("Coffee Bakery",R.drawable.bakery,"Deserts to a cup of coffee"));
        coffees.add(new Coffee("Hot Coffee",R.drawable.hot,"Warming Coffee Mixtures"));
        coffees.add(new Coffee("Christmas coffee",R.drawable.ch,"Most festive coffee recipes"));
        coffees.add(new Coffee("Valentines coffee",R.drawable.val,"Romantic and tender drinks"));
        recyclerView = findViewById(R.id.coffee_card_recycler_view);
        RecyclerViewSpacing spacing = new RecyclerViewSpacing(20,20);
        CoffeeAdapter adapter = new CoffeeAdapter(coffees);
        GridLayoutManager manager = new GridLayoutManager(this,2);
        adapter.setListener(new CoffeeAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(MainActivity.this,CoffeeListActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
        recyclerView.addItemDecoration(spacing);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}
