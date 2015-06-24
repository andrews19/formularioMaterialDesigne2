package com.example.dit00.loliapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        TextView tv_contenido= (TextView) findViewById(R.id.tv_contenido);
        TextView Edad= (TextView) findViewById(R.id.Edad);
        TextView sexo= (TextView) findViewById(R.id.sexo);
        TextView Fecha_nac= (TextView) findViewById(R.id.Fecha_nac);

        Bundle parametros= getIntent().getExtras();
        String sa= parametros.getString("textView");
        String sa2= parametros.getString("textView2");
        String sa1= parametros.getString("textView1");
        String sa3= parametros.getString("textView3");

        Fecha_nac.setText(sa3);
        tv_contenido.setText(sa);
        Edad.setText(sa1);
        sexo.setText(sa2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
