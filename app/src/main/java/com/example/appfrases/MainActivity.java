package com.example.appfrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        TextView novaFrase = findViewById(R.id.txt_novaFrase);
        Button button_gerar = findViewById(R.id.btn_gerarFrase);

        button_gerar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String [] frases ={
                        "Eu posso escrever tudo aquilo que queria sentir, mas não posso sentir tudo aquilo que um dia eu escrevi.",
                        "Se eu pudesse te encontrar e descrever o quero dizer, eu diria que apenas te amo, não posso viver sem você.",
                        "Não é drama, é dor",
                        "Pode-se ter saudades dos tempos bons, mas não se deve fugir ao presente.",
                        "A ausência apaga as pequenas paixões e fortalece as grandes.",
                        "A saudade é o que faz as coisas pararem no tempo.",
                        "Todo mundo é capaz de dominar uma dor, exceto quem a sente",
                        "O amor calcula as horas por meses, e os dias por anos; e cada pequena ausência é uma eternidade.",
                        "A ausência apaga as pequenas paixões e fortalece as grandes.",
                        "A saudade é o que faz as coisas pararem no tempo.",
                        "Saudade é melhor do que caminhar vazio.",
                        "A distância faz ao amor aquilo que o vento faz ao fogo: apaga o pequeno, inflama o grande.",
                        "Tenho saudades de tudo que ainda não vi."
                };
                Random random = new Random();
                int index = random.nextInt(frases.length);
                novaFrase.setText(frases[index]);

            }
        });


    }

}