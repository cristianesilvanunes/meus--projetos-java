import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
    // informando para o programa onde usarei as classes    
    
    Random rd = new Random();
    Scanner scanner = new Scanner(System.in);

      int numeroAleatorio;
      int numeroUsuario=100;
      //inserindo um número aleatório de 0 a 10
      numeroAleatorio = rd.nextInt(11);
      
      // enquanto o numero aleatorio for diferente do numero que o usuario digitou o loop será executado
      while(numeroAleatorio !=numeroUsuario){
        System.out.print("tente acertar o numero de 0 a 10 :");
       numeroUsuario = scanner.nextInt();

       if(numeroAleatorio == numeroUsuario){
        System.out.println("Você acertou");

       }else{
        System.out.println("Você errou!");
      }
      scanner.close();
    } 
} 
