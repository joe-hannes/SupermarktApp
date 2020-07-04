package com.example.dtg3.supermarktapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Einkaufsliste extends AppCompatActivity {

    LinearLayout _entry1, _entry2, _entry3, _details1, _details2, _details3;
    TextView _tv_details1, _tv_details2, _tv_details3;

    ImageView _iv_map1, _iv_map2, _iv_map3, _iv_edit1, _iv_edit2, _iv_edit3, _iv_delete1, _iv_delete2, _iv_delete3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einkaufsliste);

        _entry1 = findViewById(R.id.eintrag1);
        _entry2 = findViewById(R.id.eintrag2);
        _entry3 = findViewById(R.id.eintrag3);

        _details1 = findViewById(R.id.details1);
        _details2 = findViewById(R.id.details2);
        _details3 = findViewById(R.id.details3);

        _tv_details1 = findViewById(R.id.tv_details1);
        _tv_details2 = findViewById(R.id.tv_details2);
        _tv_details3 = findViewById(R.id.tv_details3);

        _iv_map1 = findViewById(R.id.iv_map1);
        _iv_map2 = findViewById(R.id.iv_map2);
        _iv_map3 = findViewById(R.id.iv_map3);

        _details1.setVisibility(View.GONE);
        _details2.setVisibility(View.GONE);
        _details3.setVisibility(View.GONE);

        _entry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (_details1.getVisibility() == View.GONE)
                {
                    _details1.setVisibility(View.VISIBLE);
                }
                else
                {
                    _details1.setVisibility(View.GONE);
                }
            }
        });

        _entry2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_details2.getVisibility() == View.GONE)
                {
                    _details2.setVisibility(View.VISIBLE);
                }
                else
                {
                    _details2.setVisibility(View.GONE);
                }
            }
        });

        _entry3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_details3.getVisibility() == View.GONE)
                {
                    _details3.setVisibility(View.VISIBLE);
                }
                else
                {
                    _details3.setVisibility(View.GONE);
                }
            }
        });

        _iv_map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),ProductFinder.class);
                startActivity(i);
            }
        });

        _iv_map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),ProductFinder.class);
                startActivity(i);
            }
        });

        _iv_map3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),ProductFinder.class);
                startActivity(i);
            }
        });
    }
}