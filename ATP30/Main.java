import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Calculadora c = new Calculadora();

      int opcao = 0;
      do{
          menu();
          opcao = escolhaMenu(sc);
          switch(opcao){
              case 1 :
              //Implementar para ser geral essa mensagem pedindo numero
                System.out.print("Informe um número:");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Informe um número:");
                int num2 = Integer.parseInt(sc.nextLine());
                int resultado = c.somar(num1, num2);           
                System.out.println("A soma é:"+resultado);      
              break;

              case 2:
              break;

              case 3:
              break;

              case 4:
                try {
                   c.dividir(3, 1);
                } catch (Exception e) {
                    //TODO: handle exception
                }
              break;

              default:
                System.out.println("Opção inválida");
              break;
          }
      }while (opcao != 0);
    }
   

    public static void menu(){
        System.out.println("----------Calculadora-----------");
        System.out.println("1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividir");
    }    

    public static int escolhaMenu(Scanner sc){
        System.out.print("Escolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    public static int lerNumero(String mensagem){
        int numero = 0;
        boolean validacao = true;

        do {
            System.out.println(mensagem);
            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Número inválido. Digite Novamente!");
                validacao = false;
            }
            
        } while (!validacao);
        return numero;
        
    }

    //comentar bloco ctrl+k+c
    //descomentar ctrl+u
}