package com.letronghieu.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTV);
        String[] countries = getResources().getStringArray(R.array.countries);
        CountryAdapter countryAdapter = new CountryAdapter(this, android.R.layout.simple_list_item_1,getListCountries());
        autoCompleteTextView.setAdapter(countryAdapter);

    }

    private List<Country> getListCountries(){
        List<Country> list = new ArrayList<>();
        list.add(new Country("Montenegro"));
        list.add(new Country("Morocco"));
        list.add(new Country("Mozambique"));
        list.add(new Country("Afghanistan"));
        list.add(new Country("Albania"));
        return list;
    }

}