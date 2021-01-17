package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("әpә", "father"));
        words.add(new Word("әṭa", "mother"));
        words.add(new Word("angsi", "son"));
        words.add(new Word("tune", "daughter"));
        words.add(new Word("taachi", "older brother"));
        words.add(new Word("chalitti", "younger brother"));
        words.add(new Word("teṭe", "older sister"));
        words.add(new Word("kolliti", "younger sister"));
        words.add(new Word("ama", "grand mother"));
        words.add(new Word("paapa", "grand father"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}