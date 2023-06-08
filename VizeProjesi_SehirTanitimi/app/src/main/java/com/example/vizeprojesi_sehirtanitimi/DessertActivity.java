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

public class DessertActivity extends AppCompatActivity {

    private ListView dListView;
    private ArrayAdapter<String> dAdapter;
    private String[] tatliIsimleri = {"Dilber Dudağı", "Erişte Tatlısı", "Fındıklı Un Helvası",
            "Fışkıl Tatlısı", "Gaysefe", "Herle", "Kara Helva", "Köme", "Muska Tatlısı", "Pestil"};
    private String[] tatliAciklamalari = {"Dilber Dudağı: Asırlık tarihe sahip geleneksel tatlılarımızın en sevileni olan un helvası her yörede kendine has şekillerde yapılır. Ana malzemeleri ve yapılış şekli bir birine benzese de damak zevkine göre lezzetlendirmek için kullanılan malzemeler farklılık gösterir. Klasik un helvasından bir farkı olmayan Gümüşhane’ye özgü bu lezzet un helvasına bolca fındık eklenmesi ile hazırlanır.",
            "Erişte Tatlısı: Erişteden tatlı mı olur diyebilirsiniz. Hem de çok güzel olur! Gümüşhane’ye özgü bir tatlı olan erişte tatlısı, Gümüşhane yöresel tatlıları listesinde ilk sırada yer almayı hak edecek kadar meşhur bir tatlı. El yapımı eriştelerin yapımı biraz zahmetli olsa da toplu halde bir seferde yapılır ve yıl boyu pratik bir şekilde tüketilir. Hazır eriştelerle yapılan erişte tatlısı da pratikliğiyle aniden gelen misafirlere hemen hazırlanıp sunulur." ,
            "Fındıklı Un Helvası: Asırlık tarihe sahip geleneksel tatlılarımızın en sevileni olan un helvası her yörede kendine has şekillerde yapılır. Ana malzemeleri ve yapılış şekli bir birine benzese de damak zevkine göre lezzetlendirmek için kullanılan malzemeler farklılık gösterir. Klasik un helvasından bir farkı olmayan Gümüşhane’ye özgü bu lezzet un helvasına bolca fındık eklenmesi ile hazırlanır.",
            "Fışkıl Tatlısı: Bildiğimiz lokma tatlısına Gümüşhane’de verilen isim fışkıl tatlısı. Ülke gelenine yayılmış geleneksel bir tatlı olan fışkıl tatlısı, Gümüşhane’de çok sık yapıldığı için şehrin yöresel tatlıları arasına girmiştir. İçerisinde süt, maya, su, un ve tuz bulunan hamur iyice yoğrulur ve mayalanması beklenir. Mayalandıktan sonra ise tatlı kolayca hazırlanır.",
            "Gaysefe: Gümüşhane yöresel yemekleri listesinde yer alan gaysefe aslen Erzurum yöresine ait bir tatlı olsa da uzun yıllardır Gümüşhane mutfaklarında da sıklıkla yapıldığı için Gümüşhane geleneksel tatlıları arasına girmiştir. Hafif ve meyveli tatlı sevenlerin çok seveceği gaysefe çok fazla bilinmese de bir kere deneyenlerin bir daha vazgeçemediği bir lezzet.",
            "Herle: Gümüşhane yöresel yemekleri listemizde başka şehirlerde bulmanızın pek mümkün olmadığı, belki de adını ilk defa duyduğunuz bir lezzet var sırada. Gümüşhane ziyaretlerinde hem yöresel hem de farklı bir tatlı denemek isteyenler için en doğru tercih olan herle, şehirde mutlaka tadılması gereken lezzetlerden biridir.",
            "Kara Helva: Osmanlı zamanlarından günümüze kadar gelmiş ve hala popülerliğini koruyan bir tatlı olan helva ülkemizin gelenekselleşmiş tatlılarından bir tanesidir. Bayramlarda, taziyelerde hem kutlama hem de yas tutma amacıyla yapılan helva her yörede sıklıkla yapıldığı için neredeyse her ilin yöresel tatlıları listesinde yerini alır. Aslında un helvasından bir farkı olamayan tatlı Gümüşhane’de kara helva olarak adlandırılır.",
            "Köme: Köme Artvin ve ilçelerinde de yapılan bir lezzet olsa da asıl ana vatanı Gümüşhane’dir. Sağlığa olan faydaları saymakla bitmeyen köme, lezzetiyle de öne çıkmaktadır. Ana malzemeleri ceviz ve pekmez olan tatlı tam kalori deposudur. Bu sayede enerji verse de formuna dikkat edenlerin fazla tüketmemesinde fayda var.",
            "Muska Tatlısı: Şerbetli tatlı sevenleri kendine hayran bırakan bir lezzet var sırada. Şekliyle sofraları, lezzetiyle de damakları şenlendiren bir tatlı olan muska tatlısı Gümüşhane’de özellikle bayram sofralarında ve özel günlerde sofralarda yerini alıyor. Lezzet olarak baklavaya benzeyen tatlı muska şekli verildiği için muska tatlısı olarak adlandırılıyor ve şekil olarak da baklavaya fark atıyor.",
            "Pestil: Gümüşhane denilince akla gelen ilk tatlılardan biri olan pestil, Gümüşhane mutfağının ülke genelinde ün kazanmasını sağlayan lezzetlerin başında gelir. Sağlığa faydaları ile de öne çıkan pestil oldukça yüksek bir enerji kaynağıdır. Aynı zamanda bağışıklık sistemini güçlendirme ve vücut hücrelerini yenileme özelliği vardır. Gümüşhane de yapılan pestilin birçok hastalığa iyi gelen selenyum minareli de içerir."};
    private int[] tatliResimleri = {R.drawable.dilberdudagi, R.drawable.eristetatlisi, R.drawable.findikliunhelvasi,
            R.drawable.fiskiltatlisi,R.drawable.gaysefetatlisi, R.drawable.herletatlisi, R.drawable.karahelva,
            R.drawable.kometatlisi, R.drawable.muskatatlisi, R.drawable.pestil};
    private Intent dessertIntent;
    static public Tatli tatli;
    private Bitmap dResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        dListView = (ListView) findViewById(R.id.dessert_activity_listView);
        dAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tatliIsimleri);
        dListView.setAdapter(dAdapter);

        dListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                dessertIntent = new Intent(DessertActivity.this, DessertInformationActivity.class);
                dResim = BitmapFactory.decodeResource(getApplicationContext().getResources(), tatliResimleri[i]);
                tatli = new Tatli(tatliIsimleri[i], tatliAciklamalari[i], dResim);
                startActivity(dessertIntent);
            }
        });
    }
}