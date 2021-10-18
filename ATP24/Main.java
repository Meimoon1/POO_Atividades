public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Carro c1 = new Carro();
        Object obj = new Object();

        v1.marca = "Toyota";
        v1.modelo = "Corolla";
        v1.placa = "AB 44506 JR";

        c1.numPortas = 4;
        c1.capacidadeMalas = "Capacidade média";

        //criando um objeto e instanciando com objeto de veiculo e carro
        Object obj1 = v1;
        Object obj2 = c1;

        Veiculo v2 = (Veiculo)obj1;
        Carro c2 = (Carro)obj2;

        //imprimindo com toString
        System.out.println(v2);
        //imprimindo normal e concatenando
        System.out.println("Número de Portas: "+c2.numPortas+" \nCapacidade do porta Malas: " + c2.capacidadeMalas);


    }
}
