package org.danlee.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcomeText;
    TextView counterText;
    Button button;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        counterText = findViewById(R.id.counter_text);
        welcomeText = findViewById(R.id.welcome_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("" + increaseCounter());
            }
        });

    }

    public int increaseCounter() {
        return ++counter;
    }
}