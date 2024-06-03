public class medidorTemperatura {
    
}import java.util.Scanner;

public class MedidorTemperatura {
    public static void main(String[] args) {
        // Criação de um scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe a temperatura atual em Celsius
        System.out.println("Por favor, informe a temperatura atual em Celsius:");
        double temperatura = scanner.nextDouble();
        
        // Avalia a temperatura informada e exibe a mensagem correspondente
        if (temperatura < 0) {
            System.out.println("Cuidado! Poderá nevar na sua região.");
        } else if (temperatura >= 0 && temperatura <= 20) {
            System.out.println("Tempo frio! Possibilidade de ventos fortes.");
        } else if (temperatura >= 21 && temperatura <= 30) {
            System.out.println("Tempo agradável durante todo o dia.");
        } else if (temperatura > 30) {
            System.out.println("Calor excessivo! Risco de insolação.");
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
