package com.example.doao;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionButoon(View v) {
        EditText etT = findViewById(R.id.idN);
        TextView etR = findViewById(R.id.textView2);

        String t = etT.getText().toString().toUpperCase();

        try {
            Integer.parseInt(t);
            etR.setText("Apenas String");
        } catch (NumberFormatException e) {
            doar tipoSangue = new doar();
            String resposta = tipoSangue.pesquisa(t);
            etR.setText(resposta);

        }
    }
}

