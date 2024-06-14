import java.util.Scanner;
public class exibirProdutos {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int codigoProduto = 1;
    while (codigoProduto !=2){
        System.out.println("CONSULTA DE PRODUTOS.");
        System.out.println("1 -consultar produto.");
        System.out.println(" - Sair do programa.");
        System.out.println("1 -Digite a opcao:");
        codigoProduto = scanner.nextInt();
          switch (codigoProduto) {
            case 5478:
            System.out.println("O produtoselecionado foi arroz de 5kg:");
            System.out.println(" preço unitário:R$ 15,90"); 
            break;

            case 3285:
            System.out.println("O produtoselecionado foi feijão de 1kg:");
            System.out.println(" preço unitário:R$ 7,50"); 
            break;    
          
            case 8097:
            System.out.println("O produtoselecionado foi macarão de 500 g:");
            System.out.println(" preço unitário:R$ 4,20"); 
            break;  
            
            case 7314:
            System.out.print("O produto selecionado foi leite de 1L: ");
            System.out.println("Preço Unitário: R$3,80");
            break;

            case 9801:
            System.out.print("O produto selecionado foi pão francês kg: ");
            System.out.println("Preço Unitário: R$12,00");
            break;

            case 8510:
            System.out.print("O produto selecionado foi açucar de 1 kg: ");
            System.out.println("Preço Unitário: R$2,90");
            break;

            case 8503:
            System.out.print("O produto selecionado foi café de 500g: ");
            System.out.println("Preço Unitário: R$8,50");
            break;

            case 2985:
            System.out.print("O produto selecionado foi óleo de soja 900l: ");
            System.out.println("Preço Unitário: R$5,60");
            break;

            case 6141:
            System.out.print("O produto selecionado foi margarina de 500g: ");
            System.out.println("Preço Unitário: R$4,50");
            break;

            case 1030:
            System.out.print("O produto selecionado foi sabão em pó de 1kg: ");
            System.out.println("Preço Unitário: R$10,00");
            break;

            case 9001:
            System.out.print("O produto selecionado foi detergente 500ml: ");
            System.out.println("Preço Unitário: R$2,20");
            break;

            case 5002:
            System.out.print("O produto selecionado foi papel higiênico 4 unidade: ");
            System.out.println("Preço Unitário: R$6,00");
            break;

            case 7436:
            System.out.print("O produto selecionado foi shampool 350ml: ");
            System.out.println("Preço Unitário: R$9,90");
            break;

            case 0274:
            System.out.print("O produto selecionado foi condicionador 350ml: ");
            System.out.println("Preço Unitário: R$9,90");
            break;

            case 7456:
            System.out.print("O produto selecionado foi pasta de dente 90g: ");
            System.out.println("Preço Unitário: R$3,50");
            break;

            case 2:
            System.out.println("Saindo do programa !");
            break;

            default:
            if (codigoProduto!=2){
                System.out.println("Opção digitada não existe"); 
            }
            break;
            }
        }
        scanner.close();
    }
}