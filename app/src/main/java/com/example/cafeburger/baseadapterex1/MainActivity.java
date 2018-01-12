package com.example.cafeburger.baseadapterex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animals.add(new Animal("狗", "犬（學名：Canis lupus familiaris）[1]，現代俗稱為狗，一種常見的犬科哺乳動物，與狼為同一種動物，生物學分類上是狼的一個亞種。狗是最早馴養於人類的一個物種。被人養的稱為家犬，返回野外沒人養的狗稱為「野狗」或「流浪狗」，是可以領養的。犬的壽命最多可達二十多年，平均則為十數年，與貓的平均壽命相近。若無發生意外，平均壽命以小型犬為長。", R.drawable.dog));
        animals.add(new Animal("Cat","貓（學名：Felis silvestris catus），通常指家貓，在現代漢語中多稱貓咪，為小型貓科動物，是為野貓（又稱斑貓；Felis silvestris）中的亞種[1]，此外也有其他未經過《國際動物命名法規》認可的命名，例如Felis catus。", R.drawable.cat));
        animals.add(new Animal("Chicken","雞（學名：Gallus gallus domesticus），是原雞屬原雞中被人類馴化而成的亞種，是家畜及家禽中數量最多，分布也最廣的，2003年的總數超過二百四十億隻[1]，世界上雞的數量比所有其他的鳥都多。家雞最初的馴化作為家禽目的是為人們提供肉、蛋等食品。具有各種特色的雞蛋，為人們提供廉價優質的動物蛋白質。", R.drawable.chicken));
        animals.add(new Animal("Lion", "獅（學名：Panthera leo），俗稱獅子（古稱狻猊），被人稱為萬獸之王。獅是一種生存在非洲和亞洲的大型貓科動物，豹屬之中最著名的一種，現存中是繼老虎之後第二大的貓科，其雄性的鬃毛是其特徵之一，過去牠分布在多個洲，但因為人類的開發，現代的獅群生存環境與分布已經大大縮小了。中國地區本來沒有獅子，直到張騫通西域以後，才從伊朗附近的地區知道獅子的存在。",R.drawable.lion));
        animals.add(new Animal("Monkey", "猴，俗稱猴子，通常用於指稱新世界猴及舊世界猴。新世界猴即闊鼻小目（Platyrrhini）；舊世界猴即猴科（Cercopithecidae），屬狹鼻小目（Catarrhini），而這個目也包括猿。因此科學上來說，猴並沒有形成一個「自然群組」，舊世界猴實際上也接近猿多過新世界猴。",R.drawable.monkey));
        animals.add(new Animal("Rabbit", "兔，又稱兔子，在漢語中是哺乳類兔形目兔科（學名：Leporidae）物種的總稱。",R.drawable.rabbit));
        animals.add(new Animal("Turtle", "龜鱉目（學名：Testudines）通稱為龜、烏龜，是脊索動物門爬行綱的一目，現存14科共341種[1]，它們的肋骨進化成特殊的骨製和軟骨護盾，稱為龜甲。[2] 龜是通常可以在陸上及水中生活，亦有長時間在海中生活的海龜。龜亦是長壽的動物，自然環境中有超過百年壽命的[3]。像很多爬行動物一般，龜是變溫動物。但是由於體內新陳代謝的作用，棱皮龜的體溫要高於周圍環境水溫。",R.drawable.turtle));

        MyAdapter myAdapter = new MyAdapter(this, animals);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(myAdapter);
    }
}
