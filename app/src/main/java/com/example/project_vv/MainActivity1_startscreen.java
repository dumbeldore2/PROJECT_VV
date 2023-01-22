package com.example.project_vv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.WindowManager;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity1_startscreen extends AppCompatActivity {

    //initen textviews
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1_startscreen);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        getWindow().setStatusBarColor(getResources().getColor(R.color.black));


        //conecten textviews
        textView1 = findViewById(R.id.title);


        //functions
        setColorToGradiant(textView1);
        //setTitleColor(textView1,textView2);

    }

    public void setTitleColor(TextView textView1 , TextView textView2){
        textView1.setTextColor(getResources().getColor(R.color.C_5));
        textView2.setTextColor(getResources().getColor(R.color.C_5));
    }

    private void setColorToGradiant(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,textView.getY(),width/2,
                textView.getY() + textView.getTextSize(),
                new int[]{
                        Color.parseColor("#BF4F26"),
                        Color.parseColor("#F2EBDF")
                },null,Shader.TileMode.MIRROR);
        textView.getPaint().setShader(shader);
    }
}