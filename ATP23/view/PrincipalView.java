package view;
import java.util.Scanner;


import controller.LivroController;
import model.Livros;

public class PrincipalView {
    public static void main(String[] args) {
        LivroController lc = new LivroController();
        Scanner sc = new Scanner(System.in);
        cabecalho();
        
       int opcao;
        
        do{     
            opcao = menu(sc);  
            switch (opcao) {
                case 1: 
                    cadastrar(sc, lc);
                break;
                    
                case 2:
                System.out.println("--------Lista de Livros-------");
                    listar(lc);
                break;
    
                case 3:
                    alterar(sc, lc);
                break;
    
                case 4:
                    excluir(sc, lc);
                break;
    
                case 5:
                    System.out.println("-----Saindo----");
                break;
            
                default:
                    System.out.println("Você digitou uma opção inválida");
                break;
            } 
        }while(opcao != 0);
     
    
        
        
    }

    private static int menu(Scanner sc) {
        System.out.println(" 1-Adicionar Livro \n 2-Listar Livros \n 3-Alterar Livros \n 4-Deletar Livro \n 5-Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void cadastrar(Scanner sc, LivroController lc){
        Livros l1 = new Livros();
        System.out.print("Informe o Id do Livro: ");
        l1.id = Integer.parseInt(sc.nextLine());
        System.out.print("\nInforme o nome do Livro: ");
        l1.nome = sc.nextLine();
        System.out.print("\nInforme o autor do Livro: ");
        l1.autor = sc.nextLine();

        lc.create(l1);
    }
   
    private static void listar(LivroController lc){
        for (Livros l: lc.read()){
            System.out.println(l);
        }
    }

    private static void alterar(Scanner sc, LivroController lc){
        Livros l1 = new Livros();
        System.out.print("Informe o Id do Livro que será alterado: ");
        l1.id = Integer.parseInt(sc.nextLine());
        System.out.print("\nInforme o nome do novo Livro: ");
        l1.nome = sc.nextLine();
        System.out.print("\nInforme o autor do novo Livro: ");
        l1.autor = sc.nextLine();
     
        lc.update(l1);
    }

    private static void excluir(Scanner sc, LivroController lc){
        Livros l1 = new Livros();
        System.out.println("Informe o id do livro que deseja apagar: ");
        l1.id = Integer.parseInt(sc.nextLine());
        lc.delete(l1);
    }
    private static void cabecalho(){
        System.out.println("-----------------------------------------");
        System.out.println("*-----------Cadastro de livros-----------*");
        System.out.println("------------------------------------------");
    }

    
}
