import java.util.Scanner;
public class QuizGame {
 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // variavel que receberá o nome do usuário
    String nomeUsuario;
    int opcaoUsuario, posicao=0,limiteRespostas=0, pontuacao=0;
    char [] gabarito = {'C','B','A','B','C','A','D','C','D','C'};
    // vetor respostas contendo as respostas que o usuário enviar
    char [] respostas = new char[10];
    //vetor de perguntas- já peenchido
    String[] perguntas = {
        "QUIZ 1. Qual é a capital do Brasil?\nA) São Paulo\nB) Rio de Janeiro\nC) Brasília\nD) Salvador",
        "QUIZ 2. Qual é o maior planeta do sistema solar?\nA) Terra\nB) Júpiter\nC) Saturno\nD) Marte",
        "QUIZ 3. Quem escreveu 'Dom Casmurro'?\nA) Machado de Assis\nB) José de Alencar\nC) Clarice Lispector\nD) Graciliano Ramos",
        "QUIZ 4. Qual é o elemento químico representado pelo símbolo 'O'?\nA) Ouro\nB) Oxigênio\nC) Osso\nD) Ósmio",
        "QUIZ 5. Em que ano o homem pisou na Lua pela primeira vez?\nA) 1959\nB) 1965\nC) 1969\nD) 1971",
        "QUIZ 6. Qual é o animal mais rápido do mundo?\nA) Guepardo\nB) Leopardo\nC) Cavalo\nD) Águia",
        "QUIZ 7. Qual é o maior oceano da Terra?\nA) Atlântico\nB) Índico\nC) Ártico\nD) Pacífico",
        "QUIZ 8. Qual é a língua mais falada no mundo?\nA) Espanhol\nB) Inglês\nC) Mandarim\nD) Hindi",
        "QUIZ 9. Qual é o país mais populoso do mundo?\nA) Índia\nB) Estados Unidos\nC) Indonésia\nD) China",
        "QUIZ 10. Quem pintou a Mona Lisa?\nA) Vincent van Gogh\nB) Pablo Picasso\nC) Leonardo da Vinci\nD) Michelangelo"
    };
    //exibir MENU de inicio para o usuário
    System.out.println("CARREGANDO O QUIZ GAME >>>>>");
    System.out.print(">>>>> DIGITE SEU NOME: ");
    nomeUsuario = scanner.nextLine();
    //exibir MENU para entrar no jogo
    System.out.println("----------------------------");
    System.out.println("##### BEM-VINDO AO QUIZ GAME - " + nomeUsuario + "#####");
    System.out.println(">>>>> DICA: UTILIZE LETRA MAIÚSCULA EM CADA RESPOSTA DAS PERGUNTAS <<<<<");
    System.out.println("DESEJA JOGAR?" );
    System.out.println("-1 - SIM" );
    System.out.println("-2 NÃO" );
    System.out.println(">>>>> DIGITE UMA OPÇÃO: ");
    opcaoUsuario = scanner. nextInt();

    while(opcaoUsuario == 1) { // enquanto for opção 1,o usúario deseja jogar
        // como o while roda toda vez,vamos percorrer o vetor de perguntas a cada loop do while
        // exibir uma pergunta
        System.out.println("---------------------------------");
        System.out.println(perguntas[posicao]); 

        //lê a resposta do usuário
        System.out.println("Sua resposta é:");
        respostas[posicao] = scanner.next().charAt(0);// pegando apenas uma letra que o usuario digitou e convertendo em CHAR
        posicao++; // pulando para a próxima posição do vetor
        limiteRespostas++; // garantindo o limite de 10 respostas do usuario

        if (limiteRespostas == 10) {
            // comparar o vetor gabarito com vetor respostas
            //para isso percorre os dois vetores e compara cada posição
            for (int indice = 0; indice < gabarito.length; indice++) {
                pontuacao = pontuacao + 1; //dá mais 1 pto para o usuario
             }    
         }  //fim do loop que percorre os vetores
         // imprimindo a resposta para o usuario
            System.out.println("FIM DE JOGO - Sua pontuaçaõ foi " + pontuacao);
             break;

        }//fechamento do while
    if(opcaoUsuario == 2){ // se opcao for 2,usuario quer sair do pgm
        System.out.println("---------------------------------");
        System.out.println("Saindo do QUIZ GAME em 3...2...1... -Até a próxima!"); 
    }
    scanner.close();

 }   
}
