package com.example.practica_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica_1.R;

public class calcula extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final aritmetica arit = new aritmetica();

        final TextView txtResultado = (TextView)findViewById(R.id.resultado);
        final EditText edtNumero1 = (EditText) findViewById(R.id.numero1);
        final EditText edtNumero2 = (EditText)findViewById(R.id.numero2);
        Button btnSuma = (Button)findViewById(R.id.btnSuma);
        Button btnResta = (Button)findViewById(R.id.btnResta);
        Button btnMult = (Button)findViewById(R.id.btnMult);
        Button btnDiv = (Button)findViewById(R.id.bntDiv);

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                arit.setNumero1(numero1);
                arit.setNumero2(numero2);
                txtResultado.setText("Resultado: "+arit.suma());

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);

                arit.setNumero1(numero1);
                arit.setNumero2(numero2);
                txtResultado.setText("Resultado: "+arit.resta());


            }
        });

        btnMult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);

                arit.setNumero1(numero1);
                arit.setNumero2(numero2);
                txtResultado.setText("Resultado: "+arit.multiplicacion());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);

                arit.setNumero1(numero1);
                arit.setNumero2(numero2);
                txtResultado.setText("Resultado: "+arit.division());
            }
        });
    }
}
