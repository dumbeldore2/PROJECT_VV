package com.example.project_vv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initen textviews
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conecten textviews
        textView1 = findViewById(R.id.title);


        //functions
        setColorToGradiant(textView1);

    }


    private void setColorToGradiant(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,0,width/2,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#F2EBDF"),
                        Color.parseColor("#BF4F26")
                },null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);
    }
}