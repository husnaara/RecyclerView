package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MenuAdapter adapter;
    private List<MenuItem> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        menuList = new ArrayList<>();
        menuList.add(new MenuItem("Pasta", "500tk", R.drawable.pasta));
        menuList.add(new MenuItem("Burger", "200tk", R.drawable.burger));
        menuList.add(new MenuItem("Pizza", "600tk", R.drawable.pizza));
        menuList.add(new MenuItem("Pasta", "500tk", R.drawable.pasta));
        menuList.add(new MenuItem("Burger", "200tk", R.drawable.burger));
        menuList.add(new MenuItem("Pizza", "600tk", R.drawable.pizza));
        menuList.add(new MenuItem("Pasta", "500tk", R.drawable.pasta));
        menuList.add(new MenuItem("Burger", "200tk", R.drawable.burger));
        menuList.add(new MenuItem("Pizza", "600tk", R.drawable.pizza));
        menuList.add(new MenuItem("Pasta", "500tk", R.drawable.pasta));
        menuList.add(new MenuItem("Burger", "200tk", R.drawable.burger));
        menuList.add(new MenuItem("Pizza", "600tk", R.drawable.pizza));

        adapter = new MenuAdapter(this, menuList);
        recyclerView.setAdapter(adapter);
    }
}
