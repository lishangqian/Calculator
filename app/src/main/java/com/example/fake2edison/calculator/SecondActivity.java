package com.example.fake2edison.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sin;



public class SecondActivity extends AppCompatActivity {


    private EditText inputEdit;
    private Button changeButton1;
    private Button changeButton2;
    private Button changeButton3;
    private Button changeButton4;
    private TextView sinText;
    private TextView cosText;
    private TextView firstText;
    private TextView secondText;
    private TextView thridText;
    private TextView huduzhiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        inputEdit = (EditText)findViewById(R.id.inputEt);
        changeButton1 = (Button)findViewById(R.id.changeBut1);
        changeButton2 = (Button)findViewById(R.id.changeBut2);
        changeButton3 = (Button)findViewById(R.id.changeBut3);
        changeButton4 = (Button)findViewById(R.id.changeBut4);

        huduzhiText = (TextView)findViewById(R.id.huduzhi);
        sinText = (TextView)findViewById(R.id.sinText);
        cosText = (TextView)findViewById(R.id.cosText);
        firstText = (TextView)findViewById(R.id.firstText);
        secondText = (TextView)findViewById(R.id.secondText);
        thridText = (TextView)findViewById(R.id.thirdText);
        changeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = inputEdit.getText().toString();
                try {
                    Double d_tmp = Double.parseDouble(tmp);
                    huduzhiText.setText("弧度制转换:"+d_tmp*Math.PI/180);
                    sinText.setText("sin:" + Math.sin(d_tmp*Math.PI/180));
                    cosText.setText("cos:" + Math.cos(d_tmp*Math.PI/180));
                    firstText.setText("二进制：" + Integer.toBinaryString(d_tmp.intValue()));
                    secondText.setText("八进制：" + Integer.toOctalString(d_tmp.intValue()));
                    thridText.setText("十六进制：" + Integer.toHexString(d_tmp.intValue()));
                }catch (Exception e){
                    e.printStackTrace();
                    huduzhiText.setText("ERROR");
                    sinText.setText("");
                    cosText.setText(" ");
                    firstText.setText(" ");
                    secondText.setText(" ");
                    thridText.setText(" ");
                }
            }
        });
        changeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = inputEdit.getText().toString();
                try {
                    int d_tmp = Integer.valueOf(tmp, 2);
                    huduzhiText.setText("弧度制转换:"+d_tmp*Math.PI/180);
                    sinText.setText("sin:" + Math.sin(d_tmp*Math.PI/180));
                    cosText.setText("cos:" + Math.cos(d_tmp*Math.PI/180));
                    firstText.setText("八进制：" + Integer.toBinaryString(d_tmp));
                    secondText.setText("十进制：" + Integer.toOctalString(d_tmp));
                    thridText.setText("十六进制：" + Integer.toHexString(d_tmp));
                }catch (Exception e){
                    e.printStackTrace();
                    huduzhiText.setText("ERROR");
                    sinText.setText("");
                    cosText.setText(" ");
                    firstText.setText(" ");
                    secondText.setText(" ");
                    thridText.setText(" ");
                }
            }
        });
        changeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = inputEdit.getText().toString();
                try {
                    int d_tmp = Integer.valueOf(tmp, 8);
                    huduzhiText.setText("弧度制转换:"+d_tmp*Math.PI/180);
                    sinText.setText("sin:" + Math.sin(d_tmp*Math.PI/180));
                    cosText.setText("cos:" + Math.cos(d_tmp*Math.PI/180));
                    firstText.setText("二进制：" + Integer.toBinaryString(d_tmp));
                    secondText.setText("十进制：" + Integer.toOctalString(d_tmp));
                    thridText.setText("十六进制：" + Integer.toHexString(d_tmp));
                }catch (Exception e){
                    e.printStackTrace();
                    huduzhiText.setText("ERROR");
                    sinText.setText("");
                    cosText.setText(" ");
                    firstText.setText(" ");
                    secondText.setText(" ");
                    thridText.setText(" ");
                }
            }
        });
        changeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = inputEdit.getText().toString();
                try {
                    int d_tmp = Integer.valueOf(tmp, 16);
                    huduzhiText.setText("弧度制转换:"+d_tmp*Math.PI/180);
                    sinText.setText("sin:" + Math.sin(d_tmp*Math.PI/180));
                    cosText.setText("cos:" + Math.cos(d_tmp*Math.PI/180));
                    firstText.setText("二进制：" + Integer.toBinaryString(d_tmp));
                    secondText.setText("八进制：" + Integer.toOctalString(d_tmp));
                    thridText.setText("十进制：" + Integer.toHexString(d_tmp));
                }catch (Exception e){
                    e.printStackTrace();
                    huduzhiText.setText("ERROR");
                    sinText.setText("");
                    cosText.setText(" ");
                    firstText.setText(" ");
                    secondText.setText(" ");
                    thridText.setText(" ");
                }
            }
        });
    }
}
