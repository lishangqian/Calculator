package com.example.fake2edison.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b_AC;
    private Button b_jia;
    private Button b_jian;
    private Button b_cheng;
    private Button b_chu;
    private Button b_Seven;
    private Button b_Eight;
    private Button b_Nine;
    private Button b_Four;
    private Button b_Five;
    private Button b_Six;
    private Button b_One;
    private Button b_Two;
    private Button b_Three;
    private Button b_Result;
    private Button b_Point;
    private Button b_Left;
    private Button b_Right;
    private Button b_Zero;
    private TextView textView;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_AC = (Button)findViewById(R.id.AC);
        b_jia = (Button)findViewById(R.id.jia);
        b_jian = (Button)findViewById(R.id.jian);
        b_cheng = (Button)findViewById(R.id.cheng);
        b_chu = (Button)findViewById(R.id.chu);
        b_Seven = (Button)findViewById(R.id.seven);
        b_Six = (Button)findViewById(R.id.six);
        b_Eight = (Button)findViewById(R.id.eight);
        b_Nine = (Button)findViewById(R.id.nine);
        b_Five = (Button)findViewById(R.id.five);
        b_Four = (Button)findViewById(R.id.four);
        b_One = (Button)findViewById(R.id.one);
        b_Three = (Button)findViewById(R.id.three);
        b_Two = (Button)findViewById(R.id.two);
        b_Result = (Button)findViewById(R.id.result);
        b_Point = (Button)findViewById(R.id.point);
        b_Left = (Button)findViewById(R.id.left);
        b_Right = (Button)findViewById(R.id.right);
        b_Zero = (Button)findViewById(R.id.zero);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        b_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
            }
        });
        b_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "+");
            }
        });
        b_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "-");
            }
        });
        b_Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "0");
            }
        });
        b_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "1");
            }
        });
        b_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "2");
            }
        });
        b_Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "3");
            }
        });
        b_Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "4");
            }
        });
        b_Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "5");
            }
        });
        b_Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "6");
            }
        });
        b_Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "7");
            }
        });
        b_Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "8");
            }
        });
        b_Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence now = textView.getText();
                textView.setText(now + "9");
            }
        });
        b_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "*");
            }
        });
        b_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "/");
            }
        });
        b_Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + "(");
            }
        });
        b_Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + ")");
            }
        });
        b_Point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                textView.setText(now + ".");
            }
        });
        b_Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence now = textView.getText();
                String content = now.toString();
                textView2.setText(baseParse(content)+"");
            }
        });
    }
    public double baseParse(String content) {
        content = replaceKuoHao(content);
        int index = content.indexOf("+");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    + baseParse(content.substring(index + 1, content.length()));
        }
        index = content.lastIndexOf("-");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    - baseParse(content.substring(index + 1, content.length()));
        }
        index = content.indexOf("*");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    * baseParse(content.substring(index + 1, content.length()));
        }
        index = content.lastIndexOf("/");
        if (index > -1) {
            return baseParse(content.substring(0, index))
                    / baseParse(content.substring(index + 1, content.length()));
        }
        if ("".equals(content.trim())) {
            return 0;
        } else {
            return Double.parseDouble(content);
        }
    }


    public String replaceKuoHao(String content) {
        try {
            int index_start = content.indexOf("(");
            int index_end = content.indexOf(")", index_start);
            index_start = content.lastIndexOf("(", index_end);
            while (index_start > -1) {
                String tmp = content.substring(index_start, index_end + 1);
                String tmpContent = tmp.substring(1, tmp.length() - 1);
                content = content.replace(tmp, baseParse(tmpContent) + "");
                index_start = content.indexOf("(");
                index_end = content.indexOf(")");
            }
            return content;
        }catch (Exception e){
            System.out.print(e);
            return "null";
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"help");
        menu.add(0,2,0,"more");
        menu.add(0,3,0,"exit");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(MainActivity.this,"这是帮助",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this,"退出",Toast.LENGTH_SHORT).show();
                finish();
                break;
            case 2:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
        }
        return true;
    }



}

