package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaInfoAlunos extends AppCompatActivity {

    private Button botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_info_alunos);

        botaoVoltar = (Button) findViewById(R.id.voltarBtn);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trocaTela = new Intent(telaInfoAlunos.this, telaInformativos_MaterialComplementar.class);
                startActivity(trocaTela);
            }
        });
    }
}