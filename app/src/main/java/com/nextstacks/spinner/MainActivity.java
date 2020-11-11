package com.nextstacks.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner statesSpinner = findViewById(R.id.spn_states);

        String[] states = getResources().getStringArray(R.array.states);

        ArrayAdapter<String> statesAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, states);

        statesSpinner.setAdapter(statesAdapter);


        statesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedState = states[position];
                Toast.makeText(MainActivity.this, selectedState, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}