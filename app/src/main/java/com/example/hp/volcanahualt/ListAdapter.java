package com.example.hp.volcanahualt;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Owner on 05/11/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHoler> {

    List<String> dataSource;
    Activity mActivity;

    public ListAdapter(Activity activity, List<String> fuenteDeDatos) {
        dataSource = fuenteDeDatos;
        mActivity = activity;
    }

    //infla_item
    public CustomViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHoler customViewHoler = new CustomViewHoler(view);
        return customViewHoler;
    }
        //Establecer los valores
    @Override
    public void onBindViewHolder(CustomViewHoler holder, int position) {
        holder.txtview.setText(dataSource.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }


    class CustomViewHoler extends RecyclerView.ViewHolder {
        public TextView txtview;

        public CustomViewHoler(View itemView) {
            super(itemView);
            txtview = (TextView) itemView.findViewById(R.id.texto);
        }
    }
}

