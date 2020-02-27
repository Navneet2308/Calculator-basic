package com.example.jaimaakali;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity{

    EditText e1;
    TextView result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot;
    Button plus;
    Button min;
    Button multi;
    Button divide;
    Button equal;
    float res1,res2;
    Button clear;
    boolean Add,sub,mul,div;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Button back = findViewById(R.id.back);

         e1 =findViewById(R.id.edt1);
         e1.setShowSoftInputOnFocus(false);
         one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clear);
equal=findViewById(R.id.equal);
         plus = findViewById(R.id.plus);
         min=findViewById(R.id.min);
         multi=findViewById(R.id.multi);
         divide=findViewById(R.id.div);
         result=findViewById(R.id.ans);
         one.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 e1.setText(e1.getText()+"1");

             }
         });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+"0");

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+".");

            }
        });

plus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (e1==null)
        {
            e1.setText("");

        }
        else {
res1=Float.parseFloat(e1.getText()+"");
Add=true;
e1.setText(null);
        }
    }
});
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1==null)
                {
                    e1.setText("");

                }
                else {
                    res1=Float.parseFloat(e1.getText()+"");
                    sub=true;
                    e1.setText(null);
                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1==null)
                {
                    e1.setText("");

                }
                else {
                    res1=Float.parseFloat(e1.getText()+"");
                    mul=true;
                    e1.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1==null)
                {
                    e1.setText("");

                }
                else {
                    res1=Float.parseFloat(e1.getText()+"");
                    div=true;
                    e1.setText(null);
                }
            }
        });
equal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        res2=Float.parseFloat(e1.getText()+"");
        if (Add==true)
        {
         result.setText(res1+res2+"");
         Add=false;
    }
        if (sub==true)
        {
            result.setText(res1-res2+"");
            sub=false;
        }
        if (mul==true)
        {
            result.setText(res1*res2+"");
            mul=false;
        }
        if (div==true)
        {
            result.setText(res1/res2+"");
            div=false;
        }}
});
clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        e1.setText("");
        result.setText("");
    }
});
    }


}
