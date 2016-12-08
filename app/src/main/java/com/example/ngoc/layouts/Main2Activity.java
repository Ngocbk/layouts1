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
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private View mColorRegion1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mColorRegion1 = findViewById(R.id.textView);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        b4.setOnClickListener(new  ColorSetter(Color.RED));
        b5.setOnClickListener(new  ColorSetter(Color.YELLOW));
        b6.setOnClickListener(new  ColorSetter(Color.BLUE));
        b7.setOnClickListener(new clear());
        b8.setOnClickListener(new onclick3());
    }
    private class ColorSetter implements View.OnClickListener{
        private int regionColor;
        public ColorSetter(int regionColor) {
            this.regionColor = regionColor;
        }
        @Override
        public void onClick(View v) {
            mColorRegion1.setBackgroundColor(regionColor);
        }
    }
    private class clear implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            mColorRegion1.setBackgroundColor(Color.WHITE);
        }
    }
    private class onclick3 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent1 = new Intent(Main2Activity.this, Main3Activity.class );
            startActivity(intent1);
        }
    }
}
