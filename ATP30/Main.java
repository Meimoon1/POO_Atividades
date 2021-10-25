import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      menu(sc);
    }
    public int somar(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }

    public void subtrair(int num1, int num2){
        int subtrair = num1 - num2;
    }

    public void multiplicar(int num1, int num2){
        int multiplicar = num1 * num2;
    }

    public void dividir(int num1, int num2){
        double dividir = num1 / num2;
    }

    public static int menu(Scanner sc){
        System.out.println("----------Calculadora-----------");
        System.out.println("1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividir \n5-Sair");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    public void escolhaMenu(Scanner sc){
        int opcao = menu(sc);
        do{
            switch(opcao){
                case 1 :
                   int r = somar(2, 3);
                   System.out.println(r);
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                default:
                break;
            }
        }while (opcao != 0);
    }
}