package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menu2 extends AppCompatActivity {

    Button msalir;
    Button mcreditos;
    Button mpuzzle;
    Button mquiz;
    Button mvolcanes;
    TextView mMenu;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        mMenu = (TextView)findViewById(R.id.txtMenu);
        String fonts = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),fonts);
        mMenu.setTypeface(T);

        mvolcanes = (Button) findViewById(R.id.btn_Volcanes);
        String g = "fonts/comic.ttf";
        Typeface typ = Typeface.createFromAsset(getAssets(),g);
        mvolcanes.setTypeface(typ);

        mquiz = (Button) findViewById(R.id.btn_prueba);
        String s ="fonts/comic.ttf";
        Typeface tp = Typeface.createFromAsset(getAssets(),s);
        mquiz.setTypeface(tp);

        msalir= (Button) findViewById(R.id.btn_salir);
        String font_path = "fonts/comic.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        msalir.setTypeface(TF);

        mcreditos= (Button) findViewById(R.id.btn_creditos);
        String font = "fonts/comic.ttf";
        Typeface type = Typeface.createFromAsset(getAssets(),font);
        mcreditos.setTypeface(type);

        mpuzzle = (Button) findViewById(R.id.btn_puzzle);
        String pu ="fonts/comic.ttf";
        Typeface t = Typeface.createFromAsset(getAssets(),pu);
        mpuzzle.setTypeface(t);


        final Button salir = (Button)findViewById(R.id.btn_salir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });


    }



}
