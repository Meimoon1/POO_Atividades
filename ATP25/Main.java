public class Main {
    public static void main(String[] args) {
        //criacao de objetos das 3 classes
        Computador c1 = new Computador();
        Notebook n1 = new Notebook();
        Desktop d = new Desktop();

        c1.marca = "Samsung";
        c1.memoriaRam = "8GB";
        c1.processador = "Intel Core i5";
        c1.discoRigido = "NVMe";

        n1.bateria ="Até 10 horas";
        n1.velocidadeWifi = "40 MB";
        n1.versaoBluetooth ="Bluetooth 5.1";

        d.tamanhoGabinete = "Torre completa";
        d.monitorExterno = "Monitor Led 29'' Ultrawide";
        d.fonte = "	40W";

        //criando objetos da classe objeto atraves das instancias de computador notebook e desktop
        Object obj1 = c1;
        Object obj2 = n1;
        Object obj3 = d;

        //conversao
        Computador c2 = (Computador)obj1;
        Notebook n2 = (Notebook)obj2;
        Desktop d2 = (Desktop)obj3;

        //impressoes
        System.out.println(c2);
        System.out.println(n2);
        System.out.println(d2);

    }
}
