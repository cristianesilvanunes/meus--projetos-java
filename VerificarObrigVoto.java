import java.util.Scanner;


public class VerificarObrigVoto {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade <=15){
            System.out.println("o eleitor não é obrigado a votar");
        }    
        if ( (idade >=16 && idade <= 17) || idade > 70){
        System.out.println("o eleitor tem voto facultativo");

        }

        if(idade >= 18 && idade <=70){
        System.out.println("o eleitor é obrigado votar");
  
        }
        scanner.close();
        
    }

}
