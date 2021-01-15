package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=(EditText)findViewById(R.id.num1);
        m2=(EditText)findViewById(R.id.num2);

    }

    public void myclickevent(View view) {
        String getnum1=m1.getText().toString();
        String getnum2=m2.getText().toString();
        Toast.makeText(this,getnum1+getnum2, Toast.LENGTH_LONG).show();
    }

}
