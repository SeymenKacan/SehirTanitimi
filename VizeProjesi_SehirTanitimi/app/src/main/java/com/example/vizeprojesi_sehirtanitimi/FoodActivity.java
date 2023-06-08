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

public class FoodActivity extends AppCompatActivity {

    private ListView fListView;
    private ArrayAdapter<String> fAdapter;
    private String[] yemekIsimleri = {"Asude Kuymağı", "Ayvalı Et Yemeği", "Borani", "Evelik Dolması",
            "Fasulye Bulgurlusu (Pağla Denlisi)", "Fırın Erişte", "Fıtfıt Haşılı", "Gendime Pilavı",
            "Gümüşhane Ekmeği", "Kartol Yahnisi", "Katıklı Çorba", "Kete", "Lemis",
            "Mantı Çorbası", "Pancar Kavurması", "Siron", "Un Herlesi Çorbası"};
    private String[] yemekAciklamalari = {"Asude Kuymağı: Kuymak denilince akla ilk olarak Trabzon gelse de neredeyse tüm Karadeniz illerinde kuymak yapılır ve günün her öğününde tüketilir. Özellikle de Trabzon ile sınır komşusu olan Gümüşhane’nin yöresel yemeklerinin arasında da yerini alır. Karadeniz bölgesinde oldukça popüler olan bu lezzet Gümüşhane’de birçok kahvaltı mekânının menüsünün de olmazsa olmazıdır.",
            "Ayvalı Et Yemeği: Gümüşhane yöresel yemekleri listemizin son yemeği oldukça farklı bir yemek! Çünkü içerisinde hem meyve hem de et var. Meyve ve et bir arada olur mu diyebilirsiniz. Hem de çok güzel olur. Gümüşhane geleneksel mutfağına ait olan yemek, tatlısı ile meşhur olan ayva ve kuzu etinin birleşimi ile enfes bir yemek çıkıyor ortaya.",
            "Borani: Şehrin geleneksel lezzetlerinden biri olan borani, et ve sebzenin muhteşem uyumuyla ortaya çıkan bir yemektir. Gümüşhane sofralarından eksik olmayan yemek yaz kış her öğünde tüketilebilir. Hem sebzelerin bütün vitaminlerini hem de proteini içinde barındıran borani, lezzetiyle de kendine hayran bırakıyor.",
            "Evelik Dolması: Birçok yörede adı duyulan evelik dolması, aslen Gümüşhane yöresine ait olan geleneksel bir yemektir. Gümüşhane dağlarında yetişen evelik bitkisiyle yapılan dolma, bildiğimiz sarmaları unutturacak bir lezzete sahiptir. Özel olarak hazırlanan iç harcıyla ve pişirme şekli ile fark yaratan dolma Gümüşhane olmak üzere tüm Kafkas coğrafyasında sıklıkla pişirilen bir dolma çeşididir.",
            "Fasulye Bulgurlusu (Pağla Denlisi): Ülkemizin milli yiyeceği fasulye ülke genelinde genelde zeytinyağlı olarak yapılsa da birçok farklı şekilde de değerlendirilebiliyor. Birçok yörede aynı şeklide yapılan ama farklı isimle adlandırılan fasulye bulgurlusu bazı yerlerde de fasulye diblesi olarak da adlandırılır. Ana malzemesi fasulye ve bulgur olan yemek hem doyurucu hem de bereketli olması nedeniyle özellikle kalabalık sofralardan eksik olmuyor.",
            "Fırın Erişte: Gümüşhane yöresel yemekleri listemizde çorbasından tatlısına erişte ile yapılan birçok tarif var. Yemek kategorisinde olsa da aslında bir çeşit tatlı olan fırın erişte özellikle makarnayı şekerli yemeyi sevenlerin gönlünü fethediyor. Özellikle ağır et yemeklerinden sonra ağızları tatlandırarak yemeği bitirmek isteyenlerin tercihi olan fırın erişte yemeğini yapmak da çok kolay.",
            "Fıtfıt Haşılı: Eski zamanlarda et ve sebze bugün ki kadar yaygın olmadığı için daha çok kuru bakliyatlarla yemek yapılırmış. Günümüzde de özellikle Doğu Anadolu ve Karadeniz bölgesi illerinde bakliyatlı yemekler çok fazla yapılmaktadır. Her iki bölgenin de yemek kültüründen etkilenen bir şehir olan Gümüşhane’de de bakliyatlı yemeklere çok sık rastlanır. Enteresan ismi ile dikkat çeken fıt fıt haşılı da Gümüşhane yöresine ait bakliyat ile yapılan bir yemektir.",
            "Gendime pilavı: Gümüşhane yöresel yemekleri listemizin başında yer alan gendime pilavı, şehrin en meşhur lezzetlerinden biridir. Bildiğimiz pilavlardan oldukça farklı olan gendime pilavı içerisinde et bulunduğu için genellikle et yemeklerin yanına değil sebze yemeklerinin yanına tamamlayıcı olarak yapılır. Hatta öyle doyurucudur ki ana yemek olarak bile tüketilebilir..",
            "Gümüşhane Ekmeği: Gümüşhane ekmeği taş fırında pişirilen ekşi mayalı ekmektir. Yuvarlak şekillidir. Ağırlığı 2 kg ile 5 kg arasında olabilir. Gümüşhane Ekmeği 27.10.2017 tarihinde Türk Patent ve Marka Kurumu tarafından tescillenmiş ve coğrafi işaret almıştır.",
            "Kartol Yahnisi: Gümüşhane’nin en meşhur et yemeklerinden biri olan kartol yahnisi, ana yemek sofralarında sıklıkla yerini alan bir sulu yemektir. Yemeğe neden kartol yahnisi denildiğini soracak olursanız Gümüşhane halkının patatese kartol dediğini öğrenmiş olursunuz. Yani kartol yahnisi bir çeşit patatesli yahnidir. Hem sebzeli hem de bol etli olan yemek besleyici özelliğiyle de dikkat çekiyor.",
            "Katıklı Çorba: Zengin bir çorba menüsüne sahip olan Gümüşhane mutfağının sevilen bir çorbası var sırada! Ayranla yapılan çorba soğuk tüketildiği için genellikle yaz aylarında sofralarda yerini alır. Günün her öğününde tüketilebilen çorba, yazın bölgeyi ziyaret edenlere de ikram edilir ve büyük beğeni alır.",
            "Kete: Gümüşhane’nin en sevilen hamur işlerinden biri olan kete kentte günün her saatinde tüketilebilen bir yiyecektir. Ülkemizin her bölgesinde yapılmasına rağmen, belki de kete denilince akla ilk Gümüşhane şehri gelir. Gül şeklinde yapılan kete hem görselliğiyle hem de lezzetiyle dikkat çekmektedir. Kentin en meşhur lezzetlerinden biri olan kete, bölge halkının olduğu kadar turistlerin de ilgisini çekmektedir.",
            "Lemis: Gümüşhane mutfağının sevilen hamur işlerinden biri olan lemis görünüş itibariyle gözlemeye benzese de malzemeleriyle ve yapılış şekliyle oldukça farklıdır. Tamamen Gümüşhane’ye özgü bir yiyecek olan lemisi başka yerde bulabilmek çok mümkün değildir. Bu yüzden de Gümüşhane ziyaretlerinde denenmesi gereken yemeklerin başında gelir.",
            "Mantı Çorbası: Gümüşhane’nin tadı damaklarda bırakan yemeklerinden sonra sıra geldi yemeklerden önce içilecek enfes çorbalara. Gümüşhane yöresel yemekleri listesinde ilk sırada yer alan mantı çorbası Gümüşhane’nin en meşhur çorbasıdır. Önceden hazırlanıp kesilen hamurlardan yapılan mantı çorbası Gümüşhane’nin nefis yemeklerinden önce harika bir başlangıçtır.",
            "Pancar Kavurması: Sadece Gümüşhane’de değil ülkemizin birçok yerinde yapılan bir yemek olan pancar kavurması var sırada. Gümüşhane’de uzun yıllardan beri sık sık yapılan yemek zamanla Gümüşhane yöresel yemekleri arasına girmeye de hak kazanmıştır. Daha çok meze olarak tüketilen pancar kavurması, pancar sevenler tarafından sofralarda ana yemeğin yanında salata olarak da tüketilir.",
            "Siron: Gümüşhane’ye özgü sevilen hamur işlerinden biri olan siron Karadeniz’in birçok ilinde de farklı isimlerde yapılır. Hafif ve yoğurtlu bir lezzet olması nedeniyle Gümüşhane’de özellikle yaz aylarında çok sık tüketilen yemek, pişmiş yufkanın sıcakken katlanıp kesilmesi ve ardından tepsiye dizilerek fırında kurutulması ile hazırlanıyor.",
            "Un Herlesi Çorbası: Sofraların vazgeçilmez başlangıcı olan çorbaların belki de binlerce farklı tarifi vardır. Bu tarifler de yöreden yöreye farklılık gösterir. Kimi çorba oldukça zahmetliyken kimisi de çok kısa sürede yapılır ama lezzetiyle fark yaratır. Gümüşhane geleneksel mutfağına ait olan yöresel çorbalardan biri olan un herlesi çorbası da sadece 3 malzeme ile yapılan ama lezzetiyle zahmetli çorbaları geride bırakan bir lezzete sahip."};
    private int[] yemekResimleri = {R.drawable.asudekuymagi, R.drawable.ayvalietyemegi, R.drawable.borani,
            R.drawable.eveliksarmasi, R.drawable.fasulyebulgurlusu, R.drawable.firineriste, R.drawable.fitfithasili,
            R.drawable.gendimepilavi, R.drawable.gumushaneekmegi, R.drawable.kartolyahnisi, R.drawable.katiklicorba,
            R.drawable.kete, R.drawable.lemis, R.drawable.manticorbasi, R.drawable.pancarkavurmasi,
            R.drawable.siron, R.drawable.unherlesi};
    private Intent foodIntent;
    static  public Yemek yemek;
    private Bitmap fResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        fListView = (ListView) findViewById(R.id.food_activity_listView);
        fAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, yemekIsimleri);
        fListView.setAdapter(fAdapter);

        fListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                foodIntent = new Intent(FoodActivity.this, FoodInformationActivity.class);
                fResim = BitmapFactory.decodeResource(getApplicationContext().getResources(), yemekResimleri[i]);
                yemek = new Yemek(yemekIsimleri[i], yemekAciklamalari[i], fResim);
                startActivity(foodIntent);
            }
        });
    }
}