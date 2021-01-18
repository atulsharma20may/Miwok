package android.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView colors = findViewById(R.id.text_colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);
            }
        });
    }

    public void goToColors(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void goToFamily(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void goToNumbers(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void goToPhrases(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}