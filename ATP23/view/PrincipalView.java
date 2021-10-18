package view;
import java.util.Scanner;
import java.util.ArrayList;

import controller.LivroController;
import model.Livros;

public class PrincipalView {
    public static void main(String[] args) {
        LivroController lc = new LivroController();
        Scanner sc = new Scanner(System.in);
        
       int opcao;
        
        do{     
            opcao = menu(sc);  
            switch (opcao) {
                case 1: 
                    cadastrar(sc, lc);
                break;
                    
                case 2:
                    listar(lc);
                break;
    
                case 3:

                break;
    
                case 4:
                  
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
        System.out.println("-------------Cadastro de Livros-------------");
        System.out.println(" 1-Adicionar Livro \n 2-Listar Livros \n 3-Alterar Livros \n 4-Deletar Livro \n 5-Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void cadastrar(Scanner sc, LivroController lc){
        Livros l1 = new Livros();
        System.out.print("Informe o Id do Livro: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("\nInforme o nome do Livro: ");
        String nome = sc.nextLine();
        System.out.print("\nInforme o autor do Livro: ");
        String autor = sc.nextLine();

        l1.setId(id);
        l1.setNome(nome);
        l1.setAutor(autor);
        LivroController lr = new LivroController();
        lr.create(l1);
    }
   
    private static void listar(LivroController lc){
        for (Livros l: lc.read()){
            System.out.println(l);
        }
    }

    
}
