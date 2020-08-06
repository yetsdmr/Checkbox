package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox javaChb;
    CheckBox phpChb;
    CheckBox pythonChb;
    CheckBox cChb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        mesajVer();
    }

    private void tanimla(){
        javaChb = findViewById(R.id.java);
        phpChb = findViewById(R.id.php);
        pythonChb = findViewById(R.id.python);
        cChb = findViewById(R.id.csharp);
    }
    private void mesajVer(){
        javaChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (javaChb.isChecked()){
                    Toast.makeText(MainActivity.this, javaChb.getText() + " tıklandı.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, javaChb.getText() + " iptal edildi.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        phpChb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phpChb.isChecked()){
                    Toast.makeText(MainActivity.this, phpChb.getText() +" tıklandı", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, phpChb.getText() +" iptal edildi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}