package com.example.vizeprojesi_sehirtanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceActivity extends AppCompatActivity {

    private ListView pListView;
    private ArrayAdapter<String> pAdapter;
    private String[] yerIsimleri = {"Altınpınar Limni Gölü Tabiat Parkı", "Artabel Gölleri Tabiat Parkı",
            "Canca Kalesi",  "Gümüşhane Konakları", "İkizevler Kent Müzesi", "İmera Manastırı",
            "Kadırga Yaylası", "Karaca Mağarası", "Kov Kalesi", "Krom Antik Kenti", "Kürtün Örümcek Ormanları",
            "Santa Harabeleri", "Sarıçiçek Köy Odaları", "Satala Antik Kenti", "Tomara Şelalesi",
            "Torul Kalesi Cam Seyir Terası", "Zigana Dağı Turizm Merkezi", "Zigana Limni Gölü"};
    private String[] yerAciklamalari = {"Altınpınar Limni Gölü Tabiat Parkı, Gümüşhane’nin Torul ilçesine bağlı en büyük köy olan Altınpınar köyüdededir. İlçeye 15 kilometre uzaklıkta, etrafı sarıçam ormanları ile çevrili, civarında otantik yaylaları ve doğal güzellikleri bulunur. Denizden 1 880 metre yükseklikte, yüzyıllar önce meydana gelen heyelan sonucu oluşmuştur",
            "Artebel Gölleri Tabiat Parkı, Gümüşhane'nin Torul ilçesindeki bir tabiat parkıdır. 1998 yılında tabiat parkı ilan edilen bölge, buzul çağında oluştuğu düşünülen ve Gülaçar köyü sınırlarında kalan beş tane göle ve göllerin aşağısında kalan Artabel Deresi'ne ev sahipliği yapmaktadır. Ayrıca tabiat parkında 15'den fazla buzul gölü daha vardır. Tarsun Ormanlarında yer alan göllerden birinin içinde ada bulunmaktadır. 5.859.000 metrekarelik alanı kaplayan tabiat parkı, yaz aylarında sıcak ve kuru, kış aylarında ise soğuktur.",
            "Canca Kalesi, Gümüşhane'nin batısında yer alan, kayalık alana inşa edilmiş bir kaledir. 1.530 metre yükseklikte kalenin restorasyonu için 2018'de 1,8 milyon lira ihale edilmiştir. Kısmen yuvarlık planlı olarak inşa edilen kale moloz taşlarla kaplıdır. Erken Orta Çağ'da inşa edilen kalenin Bizans İmparatoru I. Justinianus'a bağlı ve bölgeye hakim olan Tzanlar tarafından yaptırıldığı düşünülmektedir. Kalenin etrafındaki yapı izlerinden eskiden burada bir şehir olduğu ihtimali doğmaktadır..",
            "Gümüşhane Konakları; geniş bahçe içerisinde, iki ve üç katlı olarak sokağa ve manzaraya karşı inşa edilmiştir. Yapı malzemesi olarak mahalli taş, kerpiç ve ahşap malzemeler kullanılmıştır. Odalarda sedir, yüklük, çiçeklik, ocak gibi geleneksel uygulamalar mevcuttur. Evlerin hemen, hemen hepsi iç sofalı, çatılar ise yapıyla uyumlu, taşkın ve kademeli saçak düzenlemeleri vardır. Evlerin içerisinde, oda kapılarında ve tavanlarında geleneksel ahşap süslemeleri, dış cephelerde ise bitkisel ve geometriksel karakterli süslemeleri vardır.",
            "Gümüşhane İkizevler Kent Müzesi, Temmuz 2006 yılında ziyaretçilere açılmış tarihi Gümüşhane Konaklarının tipik örneklerindendir. Yapılış tarihi 1920 yılına dayanan konak, 2004-2006 yılları arasında restore edilmiştir. Bahçe içerisinde zemin, birinci kat ve çatı katından oluşan bina, ahşap çatkı arası dolgu tekniğinde inşa edilmiştir ve üzeri de sıvalıdır.",
            "İmera Manastırı veya Aziz John Prodromos Manastırı, Gümüşhane'nin Olucak köyünde yer alan bir manastırdır. Yazılı kaynaklara göre 1350 yılında gotik tarzda inşa edilmiş olan manastır, 1859'da rahibe Roxane tarafından yenilenmiştir. İlçe merkezine 37-38 kilometre uzaklıkta olan yapının 2019'da 160 binlik liralık bütçeyle restorasyonu başlamıştır. 2009'da III. Derece Arkeolojik Sit Alanı ilan edilen manastır, kesme ve moloz taşlarla yapılmıştır. Yapıda üç nef ve üç apsis bulunmaktadır. Yapının kapısındaki taş söve, üç kademeli frizle süslenmiştir.",
            "Kadırga Yaylası, Trabzon'un batısındaki tüm ilçelerinin yanı sıra, Gümüşhane, Torul hatta Giresun'dan gelen on binlerce kişinin katılımıyla Yayla ortası veya Çürük ortası denilen Temmuz ayının son iki ve Ağustos ayının ilk haftası yörede dernek olarak adlandırılan yayla şenlikleri düzenlenmektedir. Özellikle Temmuz ayının üçüncü cuma günü düzenlenen Kadırga Festivali, tüm yaylacıları (\"Otçu\" da denilmektedir) çeker. Kadırga Festivalinde yöresel giysilerle dans eden kadınlar.",
            "Karaca Mağarası, Gümüşhane'nin Torul ilçesine bağlı Cebeli köyü içerisindedir. Mağarada damlataşı şekilleri, sarkıtlar, dikitler, sütunlar, org desenli duvarlar, mağara çiçekleri, mağara incileri ve traverten basamakları gibi birçok doğa harikasını bir arada görebilirsiniz. Ayrıca Karaca Mağarasının havası astım hastalığı başta olmak üzere birçok solunum hastalığına iyi gelmektedir. Karaca Mağarası, denizden 1550 m yükseklikte, şehir merkezine ise 17 km uzaklıktadır.",
            "Kov Kalesi, Gümüşhane merkezinin 22 km güneydoğusunda yer alan bir kaledir. Kalenin 1361'de Bayburt bölgesinden gelen akınlara karşı koymak amacıyla Trabzon imparatoru III. Aleksios tarafından yaptırıldığı düşünülmektedir. 130 metre yükseliğinde bir kayanın üzerine, doğu-batı eksenin inşa edilmiş olan kalenin yatay uzunluğu 70 metredir. Kalenin tabanın rakımı 1630 metredir. Kalenin iç duvarları 90 cm, pürüzlü yöre taşlarında yapılmış dış duvarları 150 cm kalınlığındadır. Duvarların köşesindeki taşların yapımında ise düzgün yontma taş kullanılmıştır.",
            "Krom Antik Kenti, eski çağlardan beri önemli bir geçiş bölgesi üzerinde konuşlanmış olması ve İmera, İstavrit gibi dönemin önemli merkezlerinin arasında kalması, Krom Vadisi’ni sürekli bir cazibe merkezi haline getirmiştir. Krom Vadisi’nin maden kaynakları bakımından da zengin olması nedeniyle yüzyıllar önce binlerce kişiye ev sahipliği yaptığı rivayet edilir. Bölgede tescillenmiş 15 kilise ve şapel bulunmaktadır. Bu ibadethanelerin dışında bir kemer köprü ve Nanak Köyü’nde surlarının bir kısmı hala ayakta olan bir kale bulunmaktadır.",
            "Örümcek Ormanları, 1998 yılında koruma alanı ilan edilen, 2630 dekarlık bir alanı kaplıyor. Kürtün’e 17 km uzaklıkta olan bu alanda Avrupa ve Kafkaslar’ın en boylu ve çaplı ladin ve göknarları bulunuyor. Ortalama 417 yaşına varan ağaçlar 4 asra şahitlik etmenin verdiği gururla dimdik yükseliyor.Doğal kaynak değerleri yüksek ağaçların belirlenmesi, benzerleri ile karşılaştırılması ve bu tür ormanların kendilerini yenileyebilmesi, güçlerinin dış etmenler ile bozulmamasına bağlı. Bu nedenle benzersiz ve olağan üstü doğal güzelliğe  sahiptir.",
            "Tarihi Santa madenci kasabası ve bu yerleşimden günümüze kalan Santa Harabeleri, Gümüşhane merkez ilçeye bağlı Dumanlı köyü ve mahallelerinden oluşmaktadır. Osmanlı döneminde madenci köyü yerleşmesi olan Santa (Dumanlı Köyü), Yanbolu vadisi içerisinde ve sahilden 47 km içeride ortalama 1.600 metre yükseklikte yer almaktadır.",
            "Sarıçiçek Köy Odaları, köy merkezinde birbirine 40-50 metre kadar uzaklıkta bulunan ve ölçüleri de çok birbirine benzeyen odaların süslemeleri ilk yapıldığı günün özelliklerini korumaktadır. Etrafı yapılarla kuşatılmış olan odaların her ikisinin de girişi batıdadır. Sonradan önlerine basit küçük birer giriş mekânı eklenmiştir. Kareye yakın dikdörtgen planlı odaların üst örtüleri önceleri düz toprak dam iken iç mekâna su sızmaması için günümüzde saç ve ahşap meyilli bire çatıyla korumaya alınmıştır.",
            "Satala Antik Kenti, Kelkit İlçesi'nin 26 kilometre Güneydoğusunda bulunan Sadak Köyü Meşe İçi Dağları'nın doğu eteğinde kurulmuş olan antik kent aynı zamanda fırat sınırını muhafaza amacıyla kurulmuş bir karakol kentidir. Roma Devri özelliğini taşıyan buluntular yok denecek kadar azdır. Yüzeyde görünebilenler birkaç mezar steli hamam, su kameri ve kale surlarıdır. Ancak asıl kent üzerinin büyük bir bölümüne bugünkü yerleşim alanı konulmuştur.",
            "Tomara Şelalesi, Gümüşhane ili, Şiran ilçesi sınırlarında bulunan şelaledir. Kelkit Çayının kolu olan Tomara Çayının vadisinde yer alır. Adını çevrede yetişen tek yıllık Tomara (kaldirik) bitkisinden alır. Şelale eğim dikliğinden düşen normal şelaleler gibi değildir, eğimli bir yüzeyden akışa geçer. Sular yamaçtan gür bir karstik kaynak olarak çıkar. Şelale sularından 35 m genişliğinde, 15 yüksekten akarak Tomara Çayı'na karışır. Şelalenin suları doğu kısmında 18 m, orta kısmında 14 m, batı kesiminde 22 m'den düşmektedir.",
            "Torul Kalesi Cam Seyir Terası, Ortaçağ'da yapıldığı, Fatih Sultan Mehmet döneminde ise Osmanlı topraklarına katıldığı bilinen, savunma ve gözetleme amaçlı olan Torul Kalesi'ne yakın mesafedeki zirveye kurulu cam seyir terası yerden 240 metrelik yüksekliği ile hem Türkiye'de ki örnekleri arasında en yükseklerden birisi hem de karayoluna 2 kilometrelik mesafesiyle en yakın ve ulaşılabilir cam teraslardan birisidir.",
            "Zigana Dağı Turizm Merkezi, bir yanıyla Gümüşhane’ye diğer yanıyla Trabzon’a seslenen, 40 bin metrekareye yayılan turizm alanında tarih ve tabiat güzelliklerini saklar. Ancak gezilerek anlaşılabilecek manastırlar, tabiat harikası göller, köyler, ormanlar, tertemiz dereler bu gizemli zirvenin içerisinde yer alır. Tabiatın tüm renkleri sevdasını kadim çağlardan bu yana Zigana’da anlatır. Yaz kışa, yeşil beyaza, beyaz maviye ve nihayet tabiat, kulaklara sevda sözlerini burada fısıldar.",
            "Limni Gölü, Gümüşhane'nin Torul ilçesindeki Zigana köyünde bulunan bir göldür. Ladin, sarıçam, ardıç, göknar, böğürtlen, mor çiçekli orman gülü ve sarı çiçekli orman gülü bitkileriyle çevrili olan Ladin Gölü'nün deniz seviyesinden yüksekliği bazı kaynaklara göre 1700 metre, bazı kaynaklara göre 2024-2025 metre, bazı kaynaklara göre ise 2100 metredir. 1999'dan beri mesire alanı olan Limni Gölü, ilçe merkezine 20 kilometre, Gümüşhane'ye 44-45 kilometre uzaklıktadır. 2011 yılında tabiat parkı ilan edilen Limni Gölü'nin çevresi yürüyüş yollarıyla çevrelenmiştir."};
    private int yerResimleri[] = {R.drawable.altinpinar, R.drawable.artabel, R.drawable.canca, R.drawable.gumushanekonaklari,
            R.drawable.ikizevler, R.drawable.imera, R.drawable.kadirga, R.drawable.karaca, R.drawable.kov,
            R.drawable.krom, R.drawable.kurtun, R.drawable.santa, R.drawable.saricicek, R.drawable.satala,
            R.drawable.tomara, R.drawable.torul, R.drawable.ziganadagi, R.drawable.ziganalimni};
    private Intent placeIntent;
    static  public Yer yer;
    private Bitmap yResim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        pListView = (ListView) findViewById(R.id.place_activity_listView);
        pAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, yerIsimleri);
        pListView.setAdapter(pAdapter);

        pListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                placeIntent = new Intent(PlaceActivity.this, LocationInformationActivity.class);
                yResim = BitmapFactory.decodeResource(getApplicationContext().getResources(), yerResimleri[i]);
                yer = new Yer(yerIsimleri[i], yerAciklamalari[i], yResim);
                startActivity(placeIntent);
            }
        });
    }
}