package view;

import controllers.ProdutoController;
import modells.Produto;

import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ProdutoController pc = new ProdutoController();
        Produto p = new Produto();

        boolean continua = true;
        do{
            menu();

            int opcao = lerOpcao(sc);
            switch(opcao){
                case 1:
                    System.out.print("Informe o id do produto:");
                    p.id = Integer.parseInt(sc.nextLine());
                    System.out.print("Informe o nome no produto:");
                    p.nome = sc.nextLine();
                    System.out.print("Informe a cateogoria do produto:");
                    p.categoria = sc.nextLine();
                    System.out.print("Informe o valor do produto:");
                    p.valor = Double.parseDouble(sc.nextLine());
                    pc.create(p);
                break;

                case 2:
                    System.out.println("----------LISTA DE PRODUTOS---------");
                    for (Produto prod : pc.read()) {
                        System.out.println(prod);
                    }
                break;

                case 3:
                    System.out.print("Informe o id do produto que deseja alterar:");
                    p.id = Integer.parseInt(sc.nextLine());
                    System.out.println("Informe o novo nome do produto:");
                    p.nome = sc.nextLine();
                    System.out.println("Informe a nova categoria do produto:");
                    p.categoria = sc.nextLine();
                    System.out.println("Informe o novo valor do Produto:");
                    p.valor = Double.parseDouble(sc.nextLine());
                    pc.update(p);
                break;

                case 4:
                    System.out.print("Informe o id do produto que deseja excluir");
                    p.id = Integer.parseInt(sc.nextLine());
                    pc.delete(p);
                break;
            }
        }while(continua);   
    }

    public static void menu(){
        System.out.println("*--------CADASTRO DE PRODUTOS--------*");
        System.out.println("1-Cadastrar Cadatro \n2-Listar Produtos \n3-Atualizar Produto \n4-Apagar Produto");
        System.out.print("Digite uma opção:");
    }

    public static int lerOpcao(Scanner sc){
      
        int opcao= 0;
        boolean valido;

        do{
            try {
                opcao = Integer.parseInt(sc.nextLine());
                valido = true;
                if(opcao<0 || opcao>=5){
                    throw new IllegalArgumentException("Opção inválida\n");
                }
            } catch (NumberFormatException ex) {
                System.out.print(ex.getMessage()+ "Digite novamente:");
                valido = false;
            }
        }while(!valido);
        return opcao;
    }

   
// precisa consertar que a validação da escolha do menu não ta funcionando e fazer outras validaçoes de erro
    


}
