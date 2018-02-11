package com.happytrees.edittextlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);


    }
    //IT WORKS EVEN IF YOU CLICK BUTTON ALREADY CLICKED
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        a = editText.getText().toString();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.RadioButtonA:
                if (checked)
                     Log.e("RadioButtonA",a);
                //following code when edit text changed
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {//CharSequence is current text input in EditText after change
                        //do nothing
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {//CharSequence is current text input in EditText after change
                    Log.e("TAG"," " + s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                       //do nothing
                    }
                });

                    break;
            case R.id.RadioButtonB:
                if (checked)
                    Log.e("RadioButtonB",a);
                //following code when edit text changed
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {//CharSequence is current text input in EditText after change
                        //do nothing
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {//CharSequence is current text input in EditText after change
                    Log.e("RadioButtonB"," " + s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                       //do nothing
                    }
                });
                    break;
        }
    }
}

/*
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
 */
/*
 radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonTxtSearch:
                        break;
                    case R.id.btn:
                        break;
                }
            }
        });

 */
