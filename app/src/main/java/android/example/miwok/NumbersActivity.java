package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

//        ArrayList<String> words = new ArrayList<>();
        ArrayList<Word> words = new ArrayList<>();

//        words.add("One");
//        words.add("Two");
//        words.add("Three");
//        words.add("Four");
//        words.add("Five");
//        words.add("Six");
//        words.add("Seven");
//        words.add("Eight");
//        words.add("Nine");
//        words.add("Ten");

        words.add(new Word("lutti", "one", R.raw.number_one, R.drawable.number_one));
        words.add(new Word("otiiko", "two", R.raw.number_two, R.drawable.number_two));
        words.add(new Word("tolookosu", "three", R.raw.number_three, R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.raw.number_four, R.drawable.number_four));
        words.add(new Word("massokka", "five", R.raw.number_five, R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.raw.number_six, R.drawable.number_six));
        words.add(new Word("kenekaku", "seven", R.raw.number_seven, R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.raw.number_eight, R.drawable.number_eight));
        words.add(new Word("wo'e", "nine", R.raw.number_nine, R.drawable.number_nine));
        words.add(new Word("na'aacha", "ten", R.raw.number_ten, R.drawable.number_ten));

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item_default, words);
        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, words, R.color.category_numbers);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}