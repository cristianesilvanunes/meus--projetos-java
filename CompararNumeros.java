import java.util.Scanner;
public class CompararNumeros{

    public static void main (String[]args){
        int num1,num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        num2 = scanner.nextInt();

        if(num1 < num2){
            System.out.println("Menor valor:" + num1);
        }else if(num1 > num2){
          System.out.println("Menor valor:" + num2);   
        }else{
            System.out.println("Dois numeros iguais foram informados: ");  
        }

        scanner.close();  
    }
}