package com.example.demo_chesto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button startMonitorButton;
    private TextView dateTimeText;  // Declare globally

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMonitorButton = findViewById(R.id.start_monitor_momo);
        dateTimeText = findViewById(R.id.date_and_time);

        startMonitorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MonitorActivity.class);
                startActivity(intent);
            }
        });

        showCurrentDateTime(); // call method
    }

    private void showCurrentDateTime() {
        // Format: Monday, 21 July 2025 - 05:50 PM
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMMM yyyy - hh:mm a", Locale.getDefault());

        String currentDateTime = sdf.format(new Date());
        dateTimeText.setText(currentDateTime);
    }
}
