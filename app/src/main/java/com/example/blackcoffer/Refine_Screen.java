package com.example.blackcoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Refine_Screen extends AppCompatActivity {
    ImageView back_navi;
    SeekBar seekBar;
    ToggleButton btnCoffee;
    ToggleButton btnBusiness;
    ToggleButton btnHobbies;
    ToggleButton btnFriendship;
    ToggleButton btnMovies;
    ToggleButton btnDinning;
    ToggleButton btnDating;
    ToggleButton btnMatrimony;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_screen);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        back_navi = findViewById(R.id.back_navi);
        back_navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    onBackPressed();
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        String[] options = {"Available | Hey Let Us Connect", "Away | Stay Discrete And Watch", "Busy | Do not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! Help"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = options[position];
//                Toast.makeText(Refine_Screen.this, "Selected: " + selectedOption, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        btnCoffee = findViewById(R.id.coffee);
        btnBusiness = findViewById(R.id.business);
        btnHobbies = findViewById(R.id.hobbies);
        btnFriendship = findViewById(R.id.friends);
        btnMovies = findViewById(R.id.movies);
        btnDinning = findViewById(R.id.dining);
        btnDating = findViewById(R.id.dating);
        btnMatrimony = findViewById(R.id.matrimony);

        btnHobbies.setChecked(true);
        handleToggleButton(btnHobbies);
        btnMovies.setChecked(true);
        handleToggleButton(btnMovies);
        btnDinning.setChecked(true);
        handleToggleButton(btnDinning);
        btnDating.setChecked(true);
        handleToggleButton(btnDating);
        btnMatrimony.setChecked(true);
        handleToggleButton(btnMatrimony);

        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnCoffee);
            }
        });
        btnBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnBusiness);
            }
        });
        btnHobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnHobbies);
            }
        });
        btnFriendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnFriendship);
            }
        });
        btnMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnMovies);
            }
        });
        btnDinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnDinning);
            }
        });
        btnDating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnDating);
            }
        });
        btnMatrimony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnMatrimony);
            }
        });
    }
    void handleToggleButton(ToggleButton button) {
        if (button.isChecked()) {
            button.setBackgroundColor(getResources().getColor(R.color.btnDisableBG));
            button.setTextColor(getResources().getColor(R.color.btnDisableFG));
            button.setBackgroundResource(R.drawable.rounded_toggle_off);
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.btnEnabledBG));
            button.setTextColor(getResources().getColor(R.color.btnEnabledFG));
            button.setBackgroundResource(R.drawable.rounded_toggle_on);
        }
    }
}