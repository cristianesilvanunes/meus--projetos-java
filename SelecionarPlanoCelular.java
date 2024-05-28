import java.util.Scanner; // importei a leitura de teclado
public class  SelecionarPlanoCelular {
 
public static void main(String[] args) {
      
    int opcao;
    Scanner scanner = new Scanner(System.in);
    // exibindo menu para o usuário na tela
    System.out.println("Selecione o plano de celular que você deseja :");
    System.out.println(" 1- Plano Básico (5gb youtube) ");
    System.out.println(" 2- Plano Plus (5gb youtube) ");
    System.out.println(" 3- Plano Premium (Adição de 100 minutos de ligação) ");

    // captura o que o usuário digitar

    System.out.print("Opção :");
    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:  System.out.println("Parabéns ! O plano selecionado foi :\n plano Básico (5GB youtube)");
            break;
        case 2:System.out.println("Parabéns ! O plano Plus foi :\n plano Básico (5GB youtube)");
           break;
        case 3:System.out.println("Parabéns ! O plano Premium foi :\n(Adição de 100 minutos de ligação)");
           break;
        default:System.out.println(" Opção inválida");
            break;   
    }
    scanner.close();  
}
    
}

