package me.karimoff.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        TextView helloText = (TextView) findViewById(R.id.helloText);
        EditText inputName = (EditText) findViewById(R.id.inputName);
        helloText.setText("Hello " + inputName.getText().toString());

    }
}
