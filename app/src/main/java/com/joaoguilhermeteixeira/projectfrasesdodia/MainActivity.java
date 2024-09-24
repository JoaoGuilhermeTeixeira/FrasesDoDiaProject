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
            "Você pode ser quem você quiser.",
            "Nunca é tarde para começar a ser o que você sempre quis.",
            "Sonhos se tornam realidade quando você age.",
            "Você é mais forte do que pensa.",
            "Não desista, o início é sempre o mais difícil.",
            "Seja você mesmo, os outros já existem.",
            "O sucesso não vem do que você faz ocasionalmente, mas do que você faz consistentemente.",
            "Acredite no seu potencial.",
            "O fracasso é parte do processo de crescimento.",
            "Apaixone-se pelo processo, não apenas pelo resultado.",
            "Não se compare aos outros, compare-se com quem você era ontem.",
            "Uma mente positiva atrai coisas positivas.",
            "O poder de mudar sua vida está em suas mãos.",
            "Desistir nunca foi uma opção para quem quer vencer.",
            "Seu único concorrente é você mesmo.",
            "Os obstáculos são degraus para o sucesso.",
            "Acredite que você pode, e você já está no meio do caminho.",
            "Seja gentil consigo mesmo em sua jornada.",
            "Grandes coisas acontecem para quem não desiste.",
            "A vida começa onde termina a sua zona de conforto.",
            "O fracasso é a oportunidade de começar de novo com mais experiência.",
            "Sua atitude determina sua altitude.",
            "Invista em você, é o melhor investimento que pode fazer.",
            "O agora é o único momento que você tem certeza de possuir.",
            "Você não precisa ser perfeito, só precisa ser persistente.",
            "O segredo para seguir em frente é começar.",
            "Sonhe grande, comece pequeno, mas nunca pare.",
            "Ação é a chave para transformar seus sonhos em realidade.",
            "A gratidão transforma o que temos em suficiente.",
            "Seja o motivo pelo qual alguém acredita em bons corações.",
            "O futuro pertence àqueles que acreditam na beleza de seus sonhos.",
            "Confie no processo e continue evoluindo.",
            "Você é o criador da sua própria história.",
            "Cada novo dia é uma nova chance para mudar sua vida.",
            "Mesmo os caminhos mais longos começam com um simples passo.",
            "Deixe a coragem guiar suas decisões.",
            "Transforme seus desafios em oportunidades.",
            "Não tenha medo de errar, tenha medo de não tentar.",
            "Acredite no impossível e trabalhe para torná-lo possível.",
            "O que você faz hoje determina seu amanhã.",
            "Suas palavras têm poder, escolha-as sabiamente.",
            "A força está em você, acredite.",
            "Abrace as mudanças e aprenda com elas.",
            "Você não é o que aconteceu com você, mas o que você escolhe se tornar.",
            "Você é o único responsável pelo seu sucesso.",
            "Nenhum esforço é em vão, tudo serve de aprendizado.",
            "Pare de duvidar de si mesmo e comece a acreditar.",
            "A felicidade está no caminho, não no destino.",
            "Seu propósito é maior que qualquer obstáculo.",
            "Vá com confiança na direção dos seus sonhos.",
            "O fracasso é uma oportunidade de aprender e crescer.",
            "Seja quem você quer ser, não o que os outros esperam de você.",
            "Não é o que você tem, mas o que você faz com o que tem.",
            "Você é o resultado das suas escolhas diárias.",
            "Os momentos difíceis moldam pessoas fortes.",
            "Acredite em si mesmo e tudo se torna possível.",
            "Você é capaz de criar a vida dos seus sonhos.",
            "Viva o presente, é o único momento que você tem.",
            "A energia que você coloca no mundo, volta para você.",
            "Cada dificuldade é uma oportunidade para melhorar.",
            "Não espere por um milagre, seja o seu próprio milagre.",
            "Você é a única pessoa responsável pela sua felicidade.",
            "Persista, porque o progresso acontece aos poucos.",
            "Não deixe que os erros do passado definam seu futuro.",
            "Você pode mais do que imagina.",
            "Tenha paciência, os grandes resultados levam tempo.",
            "Todo esforço será recompensado no tempo certo.",
            "Não há elevador para o sucesso, você tem que subir as escadas.",
            "O sucesso é a soma de pequenos esforços repetidos diariamente.",
            "Quanto mais você acredita em si mesmo, mais você alcança.",
            "Seus sonhos não têm prazo de validade.",
            "Foque no que você pode controlar, e o resto se alinhará.",
            "Você está a um passo de distância de uma nova versão de si mesmo.",
            "Não existe sucesso sem sacrifício.",
            "Tenha coragem para começar e determinação para continuar.",
            "Você é mais forte do que imagina e mais capaz do que acredita.",
            "Não importa a velocidade, continue avançando.",
            "O único limite entre você e seus sonhos é a sua crença neles.",
            "Sua vida muda quando você decide que não aceitará menos do que merece.",
            "Seja a luz que ilumina o caminho de alguém.",
            "A persistência é o que separa os vencedores dos desistentes.",
            "Você pode criar seu próprio destino.",
            "Cada novo começo vem do fim de outro começo.",
            "O que você faz hoje pode melhorar todos os seus amanhãs.",
            "Seja a mudança que você quer ver no mundo.",

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
        int numeroAleatorio = new Random().nextInt(100);
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