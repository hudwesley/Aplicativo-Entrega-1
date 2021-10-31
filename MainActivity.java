package com.example.telalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //criação do botão entrar
    private Button botaoEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pega o botaoEntrao e o linka no botão entrarBtn (button da tela xml)
        botaoEntrar = (Button) findViewById(R.id.entrarBtn);

        //evento de click
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cria uma variável Intent a fim de realizar a transição entre as telas
                // Referencia a página que está (this) e a página que o usuário será redirecionado (class)
                Intent trocaTela = new Intent(MainActivity.this, telaInformativos_MaterialComplementar.class);
                startActivity(trocaTela); //executa a variável trocaTela
            }
        });
    }
}