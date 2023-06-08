package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodInformationActivity extends AppCompatActivity {

    private TextView yemekIsmi, yemekAciklama;
    private ImageView yemekResmi;
    private String fiIsim, fiAciklama;
    private Bitmap fiResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_information);

        yemekIsmi = (TextView) findViewById(R.id.food_information_activity_listViewYemekIsmi);
        yemekAciklama = (TextView) findViewById(R.id.food_information_activity_textViewAciklama);
        yemekResmi = (ImageView) findViewById(R.id.food_information_activity_imageViewYemekResmi);

        fiIsim = FoodActivity.yemek.getIsim();
        fiAciklama = FoodActivity.yemek.getAciklama();
        fiResim = FoodActivity.yemek.getResim();

        if (!TextUtils.isEmpty(fiIsim) && !TextUtils.isEmpty(fiAciklama)) {
            yemekIsmi.setText(fiIsim);
            yemekAciklama.setText(fiAciklama);
            yemekResmi.setImageBitmap(fiResim);
        }
    }
}