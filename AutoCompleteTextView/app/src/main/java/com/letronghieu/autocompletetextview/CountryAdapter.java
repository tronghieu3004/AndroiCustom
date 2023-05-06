package com.letronghieu.autocompletetextview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountryAdapter extends ArrayAdapter<Country> {
    private final List<Country> countryList;

    public CountryAdapter(@NonNull Context context, int resource, @NonNull List<Country> objects) {
        super(context, resource, objects);
        countryList = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        }
        TextView tvCountries = convertView.findViewById(R.id.autoCompleteTV);
        Country country = getItem(position);
        tvCountries.setText(country.getName());
        return convertView;
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<Country> listSuggest = new ArrayList<>();
                if (constraint == null ) {
                    listSuggest.addAll(listSuggest);
                }else {
                    String filter = constraint.toString().toLowerCase(Locale.ROOT).trim();
                    for (Country country : countryList){
                        if (country.getName().toLowerCase().contains(filter)) {
                        listSuggest.add(country);
                         }
                        }
                    }
                FilterResults filterResults = new FilterResults();
                filterResults.values = listSuggest;
                filterResults.count = listSuggest.size();
                return filterResults;
                }


            @Override
            protected void publishResults(CharSequence charSequence, FilterResults results) {
                clear();
                addAll((List<Country>)results.values);
                notifyDataSetInvalidated();
            }

            @Override
            public CharSequence convertResultToString(Object resultValue) {
                return ((Country) resultValue).getName();
            }
        };
    }
}
