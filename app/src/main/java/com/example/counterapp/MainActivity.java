package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView3;
    int images[] = {R.drawable.c, R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6};
    int count = 0, index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

    }
    public void Count(View view){
        count++;
        textView.setText(Integer.toString(count));
    }

    public void Reset(View view){
        Toast.makeText(MainActivity.this, "Set To Zero", Toast.LENGTH_LONG).show();
        count = 0;
        textView.setText(Integer.toString(count));
    }

    public void Change(View view){
        imageView3.setImageResource(images[index]);
        index++;
        if(index == 7)
            index = 0;
    }

}