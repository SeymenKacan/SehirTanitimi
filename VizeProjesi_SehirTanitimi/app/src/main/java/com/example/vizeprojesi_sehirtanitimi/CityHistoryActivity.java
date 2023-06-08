package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class CityHistoryActivity extends AppCompatActivity {

    private TextView sehirIsmi, sehirAciklama;
    private ImageView sehirResmi;
    private Intent get_chIntent;
    private String sIsim, sAciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_history);

        sehirIsmi = (TextView) findViewById(R.id.city_history_activity_listViewSehirIsmi);
        sehirAciklama = (TextView) findViewById(R.id.city_history_activity_textViewAciklama);
        sehirResmi = (ImageView) findViewById(R.id.city_history_activity_imageViewSehirResmi);

        get_chIntent = getIntent();
        sIsim = get_chIntent.getStringExtra("sehirismi");
        sAciklama = get_chIntent.getStringExtra("sehiraciklama");

        if (!TextUtils.isEmpty(sIsim) && !TextUtils.isEmpty(sAciklama)) {
            sehirIsmi.setText(sIsim);
            sehirAciklama.setText(sAciklama);
            sehirResmi.setImageBitmap(MainActivity.rSehir);
        }
    }
}