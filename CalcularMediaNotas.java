import java.util.Scanner;
public class CalcularMediaNotas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int notaDigitada,somatorioNotas=050,mediaNotas;

      for(int contador = 1; contador <= 4; contador++){
        System.out.println("Digite a nota da avaliação" + contador + ":");
        notaDigitada = scanner.nextInt();
        somatorioNotas = somatorioNotas +notaDigitada;

      }
      mediaNotas = somatorioNotas /4;
      if(mediaNotas < 5){
        System.out.println("Aluno reprovado");

      }else if(mediaNotas < 7){
        System.out.println("Aluno em recuperação");
     }else{
        System.out.println("Aluno aprovado"); 
     }
      scanner.close();
    } 
} 
