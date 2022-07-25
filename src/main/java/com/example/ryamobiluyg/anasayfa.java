package com.example.ryamobiluyg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class anasayfa extends AppCompatActivity {
    Intent intentExit;
    Intent detayintent;
    SearchView searchView;
    ListView listView;

    ArrayAdapter<String>adapter;
    String[]rüyalar =  {"Rüyada su görmek",
            "Rüyada geç kalmak",
            "Rüyada kovalanmak",
            "Rüyada dişi düşmek",
            "Rüyada sınava girmek",
            "Rüyada kilitli kalmak",
            "Rüyada insan görmek",
            "Rüyada öldüğünü görmek",
            "Rüyada para görmek",
            "Rüyada düşmek",
            "Rüyada ağlamak",
            "Rüyada at görmek",
            "Rüyada bal görmek",
            "Rüyada bebek görmek",
            "Rüyada cam kırılması",
            "Rüyada deniz görmek",
            "Rüyada ev görmek",
            "Rüyada fare görmek",
            "Rüyada geç kalmak",
            "Rüyada güvercin görmek",
            "Rüyada hediye almak",
            "Rüyada incir görmek",
            "Rüyada kaybolmak",
            "Rüyada limon görmek",
            "Rüyada nehir  görmek",
            "Rüyada okul görmek",
            "Rüyada uçmak",
            "Rüyada zeytin görmek"
    };
    String[]rüyalaraçıklama ={"Rüyada görülen su, güzel bir yaşam ve iyi bir rızkla yorumlanır. Suyun kalitesi bizim duygularımızı yönetebilme etkinliğini gösterir. Bir kimsenin evinden su çıktığını görmesi, zenginliğe ve iyiye yorumlanır.",
            "Kişinin omzuna taşıyabileceğinden çok yükler aldığının, gereğinden fazla çalıştığı ya da yorulduğunun göstergesidir. Bir uyarı olarak nitelendirilen bu durumun aslında vermek istediği mesaj tutulamayacak sözlerin verilmemesi gerektiğidir.",
            "Rüyalarınızda korktuğunuz biri ya da bir hayvan tarafından kovalandığınızı görüyorsanız, ya bir şeylerle yüzleşmekten korkuyorsunuz ya da hayatınızla ilgili bazı zorlukları ve karışıkları unutmaya çalışıyorsunuz. Ama bilinçaltınız size bunlarla yüzleşmeniz gerektiğini söylemeye çalışıyor.",
            "Diş konusunda kabul gören tek bir açıklama mevcut değil. Dişi güç ve güvenin sembolü olarak niteleyen uzmanlar bu rüyayı gören kişinin karşılaştığı bazı durumlar sonucunda bir güç ve güven kaybı yaşadığına yoruyorlar. Öte yandan bu durumu bir ilişkinin biteceği konusunda kötüye işaret olarak niteleyenler de var.",
            "Genel olarak mükemmeliyetçi kişilerin rüyalarında karşılaştıkları bir durum. Rüya kişiye her an tetikte olması gerektiğinin uyarısı niteliğinde. Özellikle yetişkinlerde kişinin kendini baskı altında hissedebileceği okul ve iş arasında bir bağ kurduğu ve bu nedenle işteki stresi simgelediği düşünülüyor.",
            "Hiç rüyanızda bir odada kilitli kaldığınızı ya da bir tabutun içinde canlı canlı gömüldüğünüzü gördünüz mü? Eğer bu tip rüyaları sık sık görüyorsanız, hayatınızda yolunda gitmediğini hissettiğiniz bir şeyler var demektir. Ya yanlış meslek seçimi yapmışsınız ve kariyerinizde ilerleyemediğinizi hissediyorsunuzdur ya da birilerinin hayatınızı özgürce yaşamanıza engel olduğunu düşünüyorsunuzdur. Ayrıca istediklerinizi yapmanızı engelleyen borçlarınızdan bunalmış olduğunuza da işaret edebilir.",
            "Rüyasında soyut olarak bir insan gören kişi, ertesi gün hayırlı bir haber ya da mektup alacak demektir. Rüyada görülen ve tanınmayan kimse, insanın kendi nefsidir. insanın kendi nefsini temsil eden kimse iyi ise insanın kendisi iyidir.",
            "Kimi uzmanların yorumu kişinin hayatında ortadan kaldırmak istediği bir ilişki, iş, kariyer planı ya da tümüyle geçmişi simgelediği yönünde. Öte yandan bu durumun kötüye yorulmak zorunda olmadığını düşünenler de var. Bu durum aslında kişinin yeni başlangıçlar ve girişimler için cesaret toplama ve heveslenme yöntemi olarak da nitelendirilebilir.",
            "Rüyada para almak veya vermek veya tomarla para görmek, parlak şans ve servete; para bulmak, şansının açılacağına, zengin olacağına işaret eder.",
            "Gerçek yaşamda sizi endişe ve korkuya iten bir olaya tanık olduğunuzu ya da bir durum hakkında haber aldığınızı ve bu konunun sizde bazı güvensizlik duyguları, korkular yarattığını simgeler.",
            "Rüyada ağladığını gören kişi, bağırmadan ağlıyorsa dertlerinden kurtulacağına yorumlanır. Rüyada ağladığını gören fakat gözlerinden yaş akmayan kişinin beklediği veya umduğu şeyler eline geçmeyeceği, ağlama sırasında sağ gözünden akmakta olan gözyaşının sol gözüne girdiğini gören kişi ise yakın bir süre içerisinde yakınlarına kavuşacağı olarak tabir edilir.",
            "At görmek ile ilgili farklı yorumlar bulunmaktadır. Rüyada at görmek rütbe, makam ve yolculuğa işeret eder. Rüyasında at gören bereketin ve bol kısmetin işaretidir. Rüyada atın kuyruğunun kıllarının çok olduğunu görmek, evlat ve akrabanın çokluğuna işarettir.",
            "Bal görmek ve yemek zenginliğe ve bolluğa erişileceğine işarettir. Çoğu tabirci rüyada bal yiyen kimsenin arzu ve isteklerine kavuşacağını düşünürler. Rüyada petekli bal yemek ise yorulmadan, sıkıntı ve zahmet çekmeden ele geçecek mal, kazanç ve paraya yorumlanır.",
            "Bebek habere, sevince, mirasa, işe, şifaya, hastalıktan, üzüntüden kurtulmaya işarettir. Rüyada bebek görmek haberdir. Rüyada güzel bebek görmek ise iyi haberdir. Çirkin, cılız, sıska bebek ise tatsız haber, dedikodu demektir.",
            "Rüyada cam kırılması, rüya sahibinin kritik bir dönemden geçeceğine işarettir. Yeni kararlar alınacağı ve bir dönüm noktasından geçeceği olarak yorumlanır. Pencere kırılması ise mutsuzluk olacağı şeklinde tabir edilir. Ayna kırılması ise şanssızlık olarak yorumlanır.",
            "Rüyada deniz görmeniz hayırlı bir rüyadır. Deniz görmek uzun ömre, bolluk ve rahatlık içinde yaşamaya yorumlanır. Aynı zamanda muradınıza ereceğinize de işaret etmektedir.",
            "Rüyada görülen evin bir çok değişik tabiri vardır. Genellikle ev huzurun ve güvenliğin bir simgesidir. Rüyada ev satın almak, yaşam tarzınızda, iş veya özel hayatınızda bir değişiklik yapacağınızın veya yapma isteğinizin olduğunun habercisidir.",
            "Rüyada fare görmek sağlıkla ilgili olduğu tabir edilir. Fare gören kişi hastalanacağı düşünülür. Diğer taraftan evinde fareler gezdiğini görmek ise bolluk bereket olarak da yorumlanır. Rüyada fare yakalamak ise yakınlarınızda bulunan kötü niyetli birini mağlup etmeye işaret eder.",
            "işinin omzuna taşıyabileceğinden çok yükler aldığının, gereğinden fazla çalıştığı ya da yorulduğunun göstergesidir. Bir uyarı olarak nitelendirilen bu durumun aslında vermek istediği mesaj tutulamayacak sözlerin verilmemesi gerektiğidir. Rüyada işe geciktiğinizi görmek, başarısızlıklar ve kayıplar yaşayacağınızın göstergesidir. Özellikle de bu dönemde davranışlarınıza ve fevri hareketlerinize özen göstermeniz gerekir.",
            "Güvercin müjdeli habere işarettir. Güvercin görmek mutluluk ve neşe getirir olarak yorumlanır. Uçarak uzaklaşıyorsa tez haber, çiçeklere veya ağaca konan güvercin ise sevgiliyle ilgili iyi haberdir.",
            "Rüyada hediye almak, rüyayı görenin belki de hayatının en bereketli, en verimli ve en mutlu döneminin yaşanacağı anlamına gelir. Rüyasında aldığı hediyeden dolayı çok sevinen kimse gerçekte de çok sevinir ve gönül ferahlığı yaşar. Kişi, meslek hayatında olumlu ve isabetli adımlar atmayı başaracağı gibi, özel hayatında da kendisine huzur verecek ve hayır getirecek kadar güzel ve doğru seçimler yapacak diye yorumlanır.",
            "Rüyada incir görmek üç değişik şekilde tabir edilir. Sarı ise hastalık, siyah ise üzüntü, yeşil ise borç olarak yorumlanır. Bir kimsenin rüyasında incir alarak yemesi, maldan para kazanacağına işarettir.",
            "Rüyada kaybolduğunuzu ya da tuzağa düştüğünüzü görmek, gerçek hayatınızda bir şeyleri deneyimlerken bazı durumlarda karar vermekte çelişkiye düşeceğeniz anlamına gelir. Rüyada kaybolup evini bulamayan kişi, işlerinde kararsız kalmış demektir. Bu kişinin kafası da oldukça karışmıştır olarak yorumlanır.",
            "Rüyada limon görmek sağlık sorunları yaşanacak anlamına işaret eder. Rüyada sarı kabuklu şeylerin genel olarak tabiri iyi değildir. Rüyada limon yemek, başarılı hayatında çekilmiyor anlamına gelir.",
            "Durgun ve yavaş akan nehir huzur, dalgalı veya hırçın ise heyecan ve strese işarettir. Nehrin bir kıyısından diğer kıyısına geçmek dertlerden kurtulma olarak tabir edilir.",
            "Rüyada okul görmek tek bir ifadeyle yorumlanmayacağı gibi hem iyi hem de kötü şekilde tabir edilir. Rüyada okul görmek güzelliğe, esenliğe, düzenli ve mantıklı olmaya işaret eder. Pişmanlık duymayı ve kazancın azalmasına da işaret eder.",
            "Bu rüyanın tabiri, uzun zamandır yük olan durumlardan kişinin kurtularak kuş kadar özgürleştiğini gösterir. Rüyada uçmak, yolculuk, başaşağı uçmak ise, rahat şekilde yapılacak yolculuktur. Yolcu olmayan kimsenin rüyada uçması ise onun işsiz kalmasına işaret edebilir.",
            "Zeytin gelir demektir. Siyah zeytin, kişinin rahat yaşamasını sağlayacak kadar bir gelire isaret eder. Yesil zeytin ise insanin mal, mülk sahibi olacağını belirtir. Rüyada zeytin görmek, zengin olmaya, zeytin yediğini görmek ise isteklerinizin geçte olsa gerçekleşeceği olarak yorumlanır.",
    };



   /** ArrayList arrayList;
    ArrayAdapter adapter;**/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       searchView=findViewById(R.id.search);
       listView=findViewById(R.id.listview);
        /***   arrayList = new ArrayList<>();
        arrayList.add("elma");
        arrayList.add("kavun");
        arrayList.add("muz");  **/

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,rüyalar);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                detayintent = new Intent(anasayfa.this, Detay.class);
                detayintent.putExtra("rüyaismi",rüyalar[i]);
                detayintent.putExtra("rüyaaçıklaması",rüyalaraçıklama[i]);
                startActivity(detayintent);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        intentExit= new Intent(Intent.ACTION_MAIN);
        intentExit.addCategory(Intent.CATEGORY_HOME);
        intentExit.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentExit);
    }
}
