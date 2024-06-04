public class contadorImpar {
    public static void main(String[] args) {
        int quantidade = 0;
                for (int contador = 1; contador <=100; contador++) {
                    if (contador % 2 != 0) {
                    System.out.print(contador + " - ");
                    quantidade++;
                    }
                }
                System.out.println("\nExistem " + quantidade + " numeros impares de 0 a 100");
            }
         } 
