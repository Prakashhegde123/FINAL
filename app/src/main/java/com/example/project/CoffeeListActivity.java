package com.example.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CoffeeListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);

        int position = getIntent().getExtras().getInt("position");

        ArrayList<Coffee> list1 = new ArrayList<>();
        list1.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list1.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list1.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list1.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list1.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));

        ArrayList<Coffee> list2 = new ArrayList<>();
        list2.add(new Coffee("Bananarama", R.drawable.alcohol, "Nice"));
        list2.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list2.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list2.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list2.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list2.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));


        ArrayList<Coffee> list3 = new ArrayList<>();
        list3.add(new Coffee("Banana mocha cooler", R.drawable.alcohol, "Nice"));
        list3.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list3.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list3.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list3.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list3.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));

        ArrayList<Coffee> list4 = new ArrayList<>();
        list4.add(new Coffee("Almond ring cake", R.drawable.alcohol, "Nice"));
        list4.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list4.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list4.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list4.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list4.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));

        ArrayList<Coffee> list5= new ArrayList<>();
        list5.add(new Coffee("Butterscotch", R.drawable.alcohol, "Nice"));
        list5.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list5.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list5.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list5.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list5.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));

        ArrayList<Coffee> list6 = new ArrayList<>();
        list6.add(new Coffee("Candy Cane coffee", R.drawable.alcohol, "Nice"));
        list6.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list6.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list6.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list6.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list6.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));

        ArrayList<Coffee> list7 = new ArrayList<>();
        list7.add(new Coffee("Cafe Rose", R.drawable.alcohol, "Nice"));
        list7.add(new Coffee("Bavarian Coffee", R.drawable.hot, "Nice drink "));
        list7.add(new Coffee("Blue Coffee", R.drawable.cold, "Tender drink "));
        list7.add(new Coffee("Brazillian Coffee", R.drawable.cocktail, "healthy drink "));
        list7.add(new Coffee("C-52", R.drawable.alcohol, "short drink "));
        list7.add(new Coffee("Calypso", R.drawable.val, "impressive drink "));



        RecyclerView recyclerView = findViewById(R.id.coffee_list_recycler_view);
        CoffeeListAdapter adapter = null;

        switch (position) {
            case 0:
                adapter = new CoffeeListAdapter(list1);
                break;
            case 1:
                adapter = new CoffeeListAdapter(list2);
                break;
            case 2:
                adapter = new CoffeeListAdapter(list3);
                break;
            case 3:
                adapter = new CoffeeListAdapter(list4);
                break;
            case 4:
                adapter = new CoffeeListAdapter(list5);
                break;
            case 5:
                adapter = new CoffeeListAdapter(list6);
                break;
            case 6:
                adapter = new CoffeeListAdapter(list7);
                break;
        }

        adapter.setListListener(new CoffeeListAdapter.listListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(CoffeeListActivity.this,OrderActivity.class);
                intent.putExtra("listPosition",position);
                startActivity(intent);
            }
        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        CoffeeListSpacing decoration = new CoffeeListSpacing(10);
        recyclerView.addItemDecoration(decoration);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}
