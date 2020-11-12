package com.example.multipurposeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    private CardView mProfile, mCurrencyConverter, mWeb, mCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mProfile = findViewById(R.id.profile);
        mCalculator = findViewById(R.id.calculator);
        mCurrencyConverter = findViewById(R.id.currency_converter);
        mWeb = findViewById(R.id.web);

        mProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, ProfilePage.class);
                startActivity(intent);
            }
        });
        mCurrencyConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, CurrencyConverter.class);
                startActivity(intent);
            }
        });

        mCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, CalculatorPage.class);
                startActivity(intent);
            }
        });

        mWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, WebPage.class);
                startActivity(intent);
            }
        });
    }
}
