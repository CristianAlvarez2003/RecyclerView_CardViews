package com.example.recyclerview_cardviews;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends MainActivity1 {

    private RecyclerView recycler;
    private AnimeAdapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar Animes
        List<Anime> items = new ArrayList<Anime>();

        items.add(new Anime(R.drawable.angel, "Angel Beats", 230));
        items.add(new Anime(R.drawable.death, "Death Note", 456));
        items.add(new Anime(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.nhk, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.suzumiya, "Suzumiya Haruhi", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);
    }

    private Object findViewById(int reciclador) {
        return null;
    }

    private void setContentView(int activity_main) {
    }
}

