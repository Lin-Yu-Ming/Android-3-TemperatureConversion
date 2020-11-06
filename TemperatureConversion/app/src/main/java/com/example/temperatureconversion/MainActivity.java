package com.example.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Celsius,Fahrenheit;
    private Button CelsiusConversionFahrenheit,FahrenheitConversionCelsius;
    private double celsius,fahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
    }

    private void findviews(){
        Celsius=(EditText)findViewById(R.id.inputC);
        Fahrenheit=(EditText)findViewById(R.id.inputF);
        CelsiusConversionFahrenheit=(Button)findViewById(R.id.CconversionF);
        FahrenheitConversionCelsius=(Button)findViewById(R.id.FconversionC);

        CelsiusConversionFahrenheit.setOnClickListener(listener);
        FahrenheitConversionCelsius.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }



    View.OnClickListener listener=new View.OnClickListener() {


        public void onClick(View v) {

            if(v.getId()==R.id.CconversionF){
                try{
                    celsius=Double.parseDouble(Celsius.getText().toString());
                }catch (NumberFormatException e){

                }

                fahrenheit=celsius*9/5+32;
                Fahrenheit.setText(String.valueOf(fahrenheit));

            }

            else if(v.getId()==R.id.FconversionC) {

                try{
                    fahrenheit=Double.parseDouble(Fahrenheit.getText().toString());
                }catch (NumberFormatException e){

                }

                celsius=(fahrenheit-32)*5/9;
                Celsius.setText(String.valueOf(celsius));



            }







        }
    };












}
