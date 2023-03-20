package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
    EditText edit;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.txtout);
        text.setText("您的BMI指数");
        edit = findViewById(R.id.inp);

        edit1 = findViewById(R.id.inp1);

    }
    public void btnClick(View v){
        String str = edit.getText().toString();
        String str1 = edit1.getText().toString();
        if(str!=null&&str.length()>0&&str1!=null&&str1.length()>0){
        float a =Float.parseFloat(str);
        float b =Float.parseFloat(str1);
        double BMI =a/(b*b);
        String str2;
        if (BMI>=40){
            str2="您极度肥胖，注意健康饮食，多运动以减重";
        } else if (BMI>=30) {
            str2="您重度肥胖，注意健康饮食，多运动以减重";
        } else if(BMI>=27){
            str2="您肥胖，注意健康饮食，多运动以减重";
        }else if(BMI>=24){
            str2="您超重，注意健康饮食，多运动以减重";
        }else if(BMI>=18.5){
            str2="您为正常体重，保持健康饮食，保持运动";
        }else {
            str2="您为偏瘦，注意健康饮食，多加运动";
        }
        text.setText("您的BMI为"+String.format("%.2f",BMI)+str2);
    }
    }
}