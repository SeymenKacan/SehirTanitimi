package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DessertInformationActivity extends AppCompatActivity {

    private TextView tatliIsmi, tatliAciklama;
    private ImageView tatliResmi;
    private String diIsim, diAciklama;
    private Bitmap diResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_information);

        tatliIsmi = (TextView) findViewById(R.id.dessert_information_activity_listViewTatliIsmi);
        tatliAciklama = (TextView) findViewById(R.id.dessert_information_activity_textViewAciklama);
        tatliResmi = (ImageView) findViewById(R.id.dessert_information_activity_imageViewTatliResmi);

        diIsim = DessertActivity.tatli.getIsim();
        diAciklama = DessertActivity.tatli.getAciklama();
        diResim = DessertActivity.tatli.getResim();

        if (!TextUtils.isEmpty(diIsim) && !TextUtils.isEmpty(diAciklama)) {
            tatliIsmi.setText(diIsim);
            tatliAciklama.setText(diAciklama);
            tatliResmi.setImageBitmap(diResim);
        }
    }
}