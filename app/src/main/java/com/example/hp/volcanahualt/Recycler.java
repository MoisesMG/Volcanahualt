package com.example.hp.volcanahualt;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


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

        mlistcontainer.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), mlistcontainer, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", Toast.LENGTH_LONG);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }//fin del metodo

    private List<String> getDatasource(){
        List<String> list= new ArrayList<>();

           list.add("Chinandega");
           list.add("León");
           list.add("Masaya");
           list.add("Managua");
           list.add("Granada");
           list.add("Rivas");
        return list;
    }
}
