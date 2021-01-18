package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

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

        words.add(new Word("lutti", "one", R.drawable.number_one));
        words.add(new Word("otiiko", "two", R.drawable.number_two));
        words.add(new Word("tolookosu", "three", R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six));
        words.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight));
        words.add(new Word("wo'e", "nine", R.drawable.number_nine));
        words.add(new Word("na'aacha", "ten", R.drawable.number_ten));

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item_default, words);
        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, words, R.color.category_numbers);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}