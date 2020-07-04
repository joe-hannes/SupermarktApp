package com.example.dtg3.supermarktapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_productFinder  = findViewById(R.id.ProduktFinder);
        btn_productFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), ProductFinderSingleItem.class);
                startActivity(i);
            }
        });

        Button btn_einkaufslisten  = findViewById(R.id.einkaufslisten);
        btn_einkaufslisten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Einkaufsliste.class);
                startActivity(i);
            }
        });

        Button btn_angebote  = findViewById(R.id.angebote);
        btn_angebote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Angebote.class);
                startActivity(i);
            }
        });

        Button btn_rezepte  = findViewById(R.id.rezepte);
        btn_rezepte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Rezeptwelt.class);
                startActivity(i);
            }
        });
    }
}
