import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
      Calculadora c = new Calculadora();

      int opcao = 0;
      do{
          menu();
          opcao = escolhaMenu(sc);
          int num1 =0;
          int num2 = 0;
          double resultado =0;
          switch(opcao){
              case 1 :
                num1 = lerNumero("Informe um número:");
                num2 = lerNumero("Informe outro número:");
                resultado = c.somar(num1, num2);
                System.out.println("A soma é:"+resultado);
              break;

              case 2:
                num1 = lerNumero("Informe um número:");
                num2 = lerNumero("Informe outro número:");
                resultado = c.subtrair(num1, num2);
                System.out.println("A subtração é:"+resultado);
                
              break;

              case 3:
                num1 = lerNumero("Informe um número:");
                num2 = lerNumero("Informe outro número:");
                resultado = c.multiplicar(num1, num2);
                System.out.println("A multiplicação é:"+resultado);
              break;

              case 4:
                num1 = lerNumero("Informe um número:");
                boolean validacao = true;
              do {
                    try {
                        num2 = lerNumero("Informe o outro número");
                        evitaZero(num2);
                    } catch (RuntimeException ex) {
                        System.out.println(ex.getMessage()+"Digite novamente");
                        validacao = false;
                    }
              } while (!validacao);
              resultado = c.dividir(num1, num2);
              System.out.println("A divisão é:"+resultado);  
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
        int opcao = 0;
        do{
            try {
                System.out.print("Digite a opção:");
                opcao = Integer.parseInt(sc.nextLine());

                if(opcao<0 || opcao>=5){
                    throw new IllegalArgumentException("Opção inválida\n");
                }
            } 
            catch (NumberFormatException ex) {
                System.out.println(ex.getMessage() + "Digite novamente!");
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage()+ "Digite novamente!");
            }

        }while(opcao <=-1 || opcao>=5);
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
                System.out.println("Número inválido. \nDigite Novamente!");
                validacao = false;
            }
            
        } while (!validacao);
        return numero;
        
    }

    static void evitaZero(int numero){
        if(numero == 0){
            throw new RuntimeException("Número Inválido");
        }
    }

  
}