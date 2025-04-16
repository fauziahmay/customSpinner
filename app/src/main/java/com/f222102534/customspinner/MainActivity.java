package com.f222102534.customspinner;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgia");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Slovenia");

        NegaraAdapter_2 na = new NegaraAdapter_2(getApplicationContext(), negaraList);
        spinner1.setAdapter(na);
    }
}