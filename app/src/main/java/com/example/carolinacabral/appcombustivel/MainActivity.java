package com.example.carolinacabral.appcombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoEtanol;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoEtanol = (EditText) findViewById(R.id.edtEtanol);
        precoGasolina = (EditText) findViewById(R.id.edtGasolina);
        botaoVerificar = (Button) findViewById(R.id.btnVerificar);
        Resultado = (TextView) findViewById(R.id.txtResultado);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Etanol = precoEtanol.getText().toString();
                String Gasolina = precoGasolina.getText().toString();

                Double valorEtanol = Double.parseDouble(Etanol);
                Double valorGasolina = Double.parseDouble(Gasolina);

                double resultadoFinal = valorEtanol / valorGasolina;

                if (resultadoFinal >= 0.7)
                {
                    Resultado.setText("RESULTADO: ABASTEÇA COM GASOLINA!");
                }
                else
                {
                    Resultado.setText("RESULTADO: ABASTEÇA COM ETANOL!");
                }
            }
        });
    }
}
