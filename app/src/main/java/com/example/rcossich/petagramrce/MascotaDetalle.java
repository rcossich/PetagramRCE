package com.example.rcossich.petagramrce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MascotaDetalle extends AppCompatActivity {

    private static final String KEY_EXTRA_URL="url";
    private static final String KEY_EXTRA_LIKES= "like";
    private ImageView imgFotoDetalle;
    private TextView  tvLikesDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_detalle);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle extras = getIntent().getExtras();
        String url    = extras.getString(KEY_EXTRA_URL);
        int likes     = extras.getInt(KEY_EXTRA_LIKES);

        tvLikesDetalle     = (TextView) findViewById(R.id.tvLikesDetalle);
        tvLikesDetalle.setText(String.valueOf(likes));

        imgFotoDetalle = (ImageView) findViewById(R.id.imgFotoDetalle);
        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.dog_pet_06)
                .into(imgFotoDetalle);

    }
}
