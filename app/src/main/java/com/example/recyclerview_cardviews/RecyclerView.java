package com.example.recyclerview_cardviews;

import android.view.View;
import android.view.ViewGroup;

public class RecyclerView {
    public void setHasFixedSize(boolean b) {
    }

    public void setLayoutManager(LayoutManager lManager) {

    }

    public void setAdapter(AnimeAdapter adapter) {

    }

    public abstract static class Adapter<A extends ViewHolder> {
        public abstract int getItemCount();

        public abstract AnimeAdapter.AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public abstract void onBindViewHolder(AnimeAdapter.AnimeViewHolder viewHolder, int i);
    }

    public static class LayoutManager {
    }

    public static class ViewHolder {
        public ViewHolder(View v) {

        }
    }
}
