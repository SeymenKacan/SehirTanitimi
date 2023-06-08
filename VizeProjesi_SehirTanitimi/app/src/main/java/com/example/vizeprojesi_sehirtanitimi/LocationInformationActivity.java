package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationInformationActivity extends AppCompatActivity {

    private TextView yerIsmi, yerAciklama;
    private ImageView yerResmi;
    private String yIsim, yAciklama;
    private Bitmap yResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_information);

        yerIsmi = (TextView) findViewById(R.id.location_information_activity_listViewYerIsmi);
        yerAciklama = (TextView) findViewById(R.id.location_information_activity_textViewAciklama);
        yerResmi = (ImageView) findViewById(R.id.location_information_activity_imageViewYerResmi);

        yIsim = PlaceActivity.yer.getIsim();
        yAciklama = PlaceActivity.yer.getAciklama();
        yResim = PlaceActivity.yer.getResim();

        if (!TextUtils.isEmpty(yIsim) && !TextUtils.isEmpty(yAciklama)) {
            yerIsmi.setText(yIsim);
            yerAciklama.setText(yAciklama);
            yerResmi.setImageBitmap(yResim);
        }
    }
}