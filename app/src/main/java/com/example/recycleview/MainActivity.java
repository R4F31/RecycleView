package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.adapter.RecyclerAdapter;
import com.example.recycleview.model.ItemList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
    }


    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<ItemList> getItems(){
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Correo importante", "No podre asistir a clase", R.drawable.images));
        itemLists.add(new ItemList("Correo spam", "Compre esta oferta", R.drawable.images));
        itemLists.add(new ItemList("Correo 2", "correo para saber si vendra a clase", R.drawable.images));
        itemLists.add(new ItemList("Correo Cosme", "No podre venir a clase estoy esquiando", R.drawable.images));
        itemLists.add(new ItemList("Correo Carlets", "Arribate ", R.drawable.images));
        itemLists.add(new ItemList("Correo Bernat", "Hola que tal", R.drawable.images));
        itemLists.add(new ItemList("Correo Rafel", "Si, gracis", R.drawable.images));
        return itemLists;
    }
}