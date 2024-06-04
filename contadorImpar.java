public class contadorImpar {
    
}public class ContadorImpar {
    public static void main(String[] args) {
        // Inicializa a contagem de números ímpares
        int contador = 0;
        
        // StringBuilder para armazenar os números ímpares
        StringBuilder numerosImpares = new StringBuilder("São números ímpares: ");
        
        // Loop para encontrar e exibir números ímpares de 1 até 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                numerosImpares.append(i).append(" - ");
                contador++; // Incrementa o contador de números ímpares
            }
        }
        
        // Remove o último " - " desnecessário
        if (numerosImpares.length() > 0) {
            numerosImpares.setLength(numerosImpares.length() - 3);
        }
        
        // Exibe os números ímpares
        System.out.println(numerosImpares.toString());
        
        // Exibe a quantidade de números ímpares
        System.out.println("Existem: " + contador + " números ímpares de 1 até 100.");
    }
}
