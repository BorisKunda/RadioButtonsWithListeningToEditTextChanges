package com.happytrees.edittextlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText)findViewById(R.id.ET);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.e("INPUT","1");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.e("INPUT","2");
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.e("INPUT","3");
            }
        });
    }
}
