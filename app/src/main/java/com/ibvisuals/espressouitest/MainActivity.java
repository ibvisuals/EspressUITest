package com.ibvisuals.espressouitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ibvisuals.espressouitest.R;

public class MainActivity extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.edit1);
    }

    public void doSomething(View view) {
        Intent i1 = new Intent(this,Second.class);
        i1.putExtra("ke1",e1.getText().toString());
        startActivity(i1);
    }
}