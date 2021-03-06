package com.example.hp.volcanahualt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Owner on 05/11/2016.
 */
public class VolcanesAdapter extends RecyclerView.Adapter<VolcanesAdapter.VolcanesViewHolder> {
    private List<Volcanes> items;

    @Override
    public VolcanesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,viewGroup,false);
        return new VolcanesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(VolcanesViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class VolcanesViewHolder extends RecyclerView.ViewHolder{
        //campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;

        public VolcanesViewHolder(View v){
            super(v);
            imagen=(ImageView)v.findViewById(R.id.imagen);
            nombre =(TextView)v.findViewById(R.id.nombre);
        }
    }

    public VolcanesAdapter(List<Volcanes> items){
        this.items=items;
    }

}



