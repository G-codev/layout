package com.gustiramadhan.latihanlayoutv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int skorA = 0;
    private int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3PoinA(View view) {
        skorA = skorA + 3;
        TextView textViewA = findViewById(R.id.skora);
        textViewA.setText(String.valueOf(skorA));
    }

    public void tambah3PoinB(View view) {
        skorB = skorB + 3;
        TextView textViewB = findViewById(R.id.skorb);
        textViewB.setText(String.valueOf(skorB));
    }
}
