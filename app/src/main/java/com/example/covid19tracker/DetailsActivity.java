package com.example.covid19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private int position;
    TextView tVcountry, tvcases, tvRecovered, tvCritical, tvActive, tvTodayCases, tvTotalDeaths, tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        position = intent.getIntExtra("position", 0);
        getSupportActionBar().setTitle("Covid19 Details of " + AffectedCountries.countryModelList.get(position).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tVcountry = findViewById(R.id.tvCountryName);
        tvcases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTotalCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeath);
        tVcountry.setText(AffectedCountries.countryModelList.get(position).getCountry());
        tvcases.setText(AffectedCountries.countryModelList.get(position).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(position).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(position).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(position).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(position).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(position).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(position).getTodayDeaths());


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) ;
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}