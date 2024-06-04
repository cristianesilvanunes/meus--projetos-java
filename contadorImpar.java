public class contadorImpar {
    public static void main(String[] args) {
        int quantidade = 0;
                for (int i = 1; i<100; i++) {
                    if (i % 2 == 1) {
                    System.out.print(" " + i + "  ||");
                    quantidade++;
                    }
                }
                System.out.println("\nExistem " + quantidade + " numeros impares de 0 a 100");
            }
         } 
