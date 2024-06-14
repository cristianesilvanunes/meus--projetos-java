import java.security.SecureRandom;
import java.util.Random;

public class PeenchendorMatriz {
   public static void main(String[] args) {
   
    int matriz[][] = new int [5][5];
    
    for(int linha = 0; linha<5; linha++){
        for(int coluna=0; coluna<5; coluna++){
            matriz[linha][coluna] = new SecureRandom().nextInt(100);
        }
    }

    for(int linha = 0; linha<5; linha++){
        for(int coluna=0; coluna<5; coluna++){
            System.out.print(matriz[linha][coluna] + "-");
        }
       System.out.print("\n"); 
    }


    }
   }

