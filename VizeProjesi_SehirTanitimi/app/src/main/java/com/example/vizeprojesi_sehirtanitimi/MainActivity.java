package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayAdapter<String> mAdapter;
    private String[] sehirOzellik = {"Gümüşhane Tarihçesi", "Gümüşhanede Bulunan Tarihi Yerler",
            "Gümüşhane Yöresel Yemekleri", "Gümüşhane Yöresel Tatlıları"};
    private String sehirAciklama = "Gümüşhane kenti ağırlıklı olarak Harşit Çayı'nın sağ sahilinde, yüksek tepeliklerin nispeten dar eteklerinde 12 km uzunluğunda şerit halinde uzanmaktadır. Topoğrafyanın imkan verdiği ölçüde Harşit Çayı'nın sol sahilinde de yerleşim görülmektedir. Şehir merkezinin en yüksek 1952 m yüksekliğindeki Kuşakkaya Tepesi'dir.";
    private int sehirResim = R.drawable.gumushane;
    private Intent cityHistoryIntent;
    static public Bitmap rSehir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.main_activity_listView);
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, sehirOzellik);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    cityHistoryIntent = new Intent(MainActivity.this, CityHistoryActivity.class);
                    cityHistoryIntent.putExtra("sehirismi", sehirOzellik[i]);
                    cityHistoryIntent.putExtra("sehiraciklama", sehirAciklama);
                    rSehir = BitmapFactory.decodeResource(getApplicationContext().getResources(), sehirResim);
                    startActivity(cityHistoryIntent);
                } else if (i == 1) {
                    cityHistoryIntent = new Intent(MainActivity.this, PlaceActivity.class);
                    startActivity(cityHistoryIntent);
                } else if (i == 2) {
                    cityHistoryIntent = new Intent(MainActivity.this, FoodActivity.class);
                    startActivity(cityHistoryIntent);
                } else if (i == 3) {
                    cityHistoryIntent = new Intent(MainActivity.this, DessertActivity.class);
                    startActivity(cityHistoryIntent);
                }
            }
        });
    }
}