package com.kietlpt.mob1032_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Anh xa view

        edt1= findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);
        tv1=findViewById(R.id.tvKqua);

        // lang nghe su kien click vao button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a, b, tong;
                a= Double.parseDouble(edt1.getText().toString());
                b= Double.parseDouble(edt2.getText().toString());
                tong = a+b;
                tv1.setText("Ket qua: "+ tong);
            }
        });


    }
}
