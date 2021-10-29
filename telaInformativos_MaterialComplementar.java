package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaInformativos_MaterialComplementar extends AppCompatActivity {

    private Button botaoInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informativos_material_complementar);

        botaoInfo = (Button) findViewById(R.id.botaoAluno);
        botaoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trocarTela = new Intent(telaInformativos_MaterialComplementar.this, telaInfoAlunos.class);
                startActivity(trocarTela);
            }
        });

    }
}