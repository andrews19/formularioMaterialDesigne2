package com.example.dit00.loliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText editText;
    TextView textView;
    EditText editText1;
    RadioButton r1,r2;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclic(View view) {
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        editText1 = (EditText) findViewById(R.id.editText1);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        Intent i = new Intent(this, MainActivity2Activity.class);


        DatePicker calend= (DatePicker) findViewById(R.id.datePicker);
        String fecha=+calend.getDayOfMonth()+"/"+calend.getMonth()+"/"+calend.getYear() ;




        if (r1.isChecked()==true) {

            String resu="Mujer";
            i.putExtra("textView2", resu);

        } else
        if (r2.isChecked() == true) {
            String resu="Hombre";
            i.putExtra("textView2", resu);

        }


        String s=editText.getText().toString();
        i.putExtra("textView1", s);
        i.putExtra("textView3", fecha);

        String Edad=editText1.getText().toString();

        i.putExtra("textView", Edad);
        startActivity(i);
    }



}