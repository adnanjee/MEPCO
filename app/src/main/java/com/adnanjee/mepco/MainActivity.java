package com.adnanjee.mepco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void getBill(View v){

        TextView tv = (TextView) findViewById(R.id.editText);
        String str = tv.getText().toString();
        Intent intent = new Intent(this, DisplayBill.class);
        intent.putExtra("message",str);
        startActivity(intent);
    }
}
