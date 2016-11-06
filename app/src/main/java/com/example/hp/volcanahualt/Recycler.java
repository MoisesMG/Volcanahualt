package com.example.hp.volcanahualt;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Owner on 05/11/2016.
 */
public class Recycler extends AppCompatActivity {
    RecyclerView mlistcontainer;
    TextView conocevolcanes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_mainr);

        conocevolcanes = (TextView)findViewById(R.id.txtConoceVolcanes);
        String fonts = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),fonts);
        conocevolcanes.setTypeface(T);

       mlistcontainer = (RecyclerView)findViewById(R.id.listContainer);
        ListAdapter adapter=new ListAdapter(this,getDatasource());
        mlistcontainer.setLayoutManager(new LinearLayoutManager(this));
        mlistcontainer.setAdapter(adapter);

    }

    private List<String> getDatasource(){
        List<String> list= new ArrayList<>();

       for (int i=0;i<7;i++){
           list.add("Departamento 1"+i);
       }

        return list;
    }
}
