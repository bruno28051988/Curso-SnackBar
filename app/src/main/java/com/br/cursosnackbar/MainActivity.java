package com.br.cursosnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnSnackbarAbrir;
    private Button btnSnackbarFechar;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackbarAbrir = findViewById(R.id.buttonSnackbar);
        btnSnackbarFechar = findViewById(R.id.buttonFechar);

        btnSnackbarAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Snackbar.make(
                        view,
                        "Botão presionado",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //btnSnackbarAbrir.setText("Botão abrir alterado");
                    }
                }).setActionTextColor(getResources().getColor(R.color.design_default_color_secondary_variant))
                         .show();


            }
        });

        /*
        btnSnackbarFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });
         */
    }
}