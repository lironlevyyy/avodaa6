package com.example.avoda6;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tx;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx=findViewById(R.id.tx);

    }

    public void Clickme(View view) {
        count++;
        if (count==7) {
            tx.setText("Enough to click.Go to new start!");
            count = 0;
        } else{
            tx.setText(""+count);

        }
    }
}