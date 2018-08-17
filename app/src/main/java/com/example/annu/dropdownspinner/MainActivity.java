package com.example.annu.dropdownspinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtName,edtPhone;
Spinner spnCountry;
AutoCompleteTextView atxtState;
Button btnSave;
RadioGroup  rdgGender;
CheckBox chb10th,chb12th,chbGD,chbPG;


String [] countries={"India", "China","USA","Canada","Japan",""};
String[] states= {"Bihar","Maharastra","MP","Meghalaya","Rajasthan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=findViewById(R.id.edtName);
        edtPhone=findViewById(R.id.edtPhone);
        spnCountry=findViewById(R.id.spnCountry);
        atxtState=findViewById(R.id.atxtState);
        btnSave=findViewById(R.id.btnSave);
        rdgGender=findViewById(R.id.rdgGender);
        chb10th=findViewById(R.id.chb10th);
        chb12th=findViewById(R.id.chb12th);
        chbGD=findViewById(R.id.chbGD);
        chbPG=findViewById(R.id.chbPG);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);

        ArrayAdapter<String> statesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,states);

        spnCountry.setAdapter(countryAdapter);
        atxtState.setThreshold(1);
        atxtState.setTextColor(Color.BLUE);
        atxtState.setAdapter(statesAdapter);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Toast.makeText(MainActivity.this,

                                "\ncountries : " +spnCountry.getSelectedItem().toString() +
                                "\nstates : " + atxtState.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
