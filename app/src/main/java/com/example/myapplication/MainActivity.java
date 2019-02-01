package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonclick(View view) {
        TextView textview = (TextView) findViewById(R.id.textView);
        EditText edittext = (EditText) findViewById(R.id.editText);
        String text = edittext.getText().toString();
        textview.setText(text);
        Toast.makeText(this, "Text updated.", Toast.LENGTH_SHORT).show();
    }
}
