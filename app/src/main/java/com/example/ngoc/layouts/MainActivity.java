package com.example.ngoc.layouts;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private Button b1;
    private View mColorRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorRegion = findViewById(R.id.textView5);
        b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        b1.setOnClickListener(new onclick1());
        b2.setOnClickListener(new onclick2());
        b3.setOnClickListener(new onclick3());
    }

    private class onclick1 implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
                int idChecked = radioGroup.getCheckedRadioButtonId();
                switch (idChecked) {
                    case R.id.radioButton1:
                        setColor(Color.RED);
                        break;
                    case R.id.radioButton2:
                        setColor(Color.YELLOW);
                        break;
                    case R.id.radioButton3:
                        setColor(Color.BLUE);
                        break;
                    default:
                        setColor(Color.WHITE);
                }
            }
    }
    private void setColor(int color){
        mColorRegion.setBackgroundColor(color);
    }
    private class onclick2 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            setColor(Color.WHITE);
        }
    }
    private class onclick3 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, Main2Activity.class );
            startActivity(intent);
        }
    }
}





