package com.joaoguilhermeteixeira.projectfrasesdodia;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos
    String[] frases = {
            "Você é capaz de alcançar o que deseja, basta acreditar.",
            "Grandes conquistas começam com pequenos passos.",
            "Não deixe o medo de falhar impedi-lo de tentar.",
            "A persistência é o caminho para o sucesso.",
            "A mudança começa dentro de você.",
            "Todos os dias são uma nova oportunidade para recomeçar.",
            "Seja a melhor versão de si mesmo.",
            "O único limite é aquele que você coloca em si mesmo.",
            "Desafios são oportunidades disfarçadas.",
            "Faça do hoje o seu melhor dia.",
            "Cada esforço é um passo mais perto da vitória.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //gerar frase aleatoria
    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(11);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);

    }
   //exibir todas as frases
    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado); //chamando o id do buttum

        String textoResultado = "";
        for (String frase : frases ){
            textoResultado = textoResultado + frase + "\n";


        }
        texto.setText( textoResultado);


    }


}