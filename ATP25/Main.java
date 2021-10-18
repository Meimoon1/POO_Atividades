public class Main {
    public static void main(String[] args) {
        //criacao de objetos das 3 classes
        Computador c = new Computador();
        Notebook n = new Notebook();
        Desktop d = new Desktop();

        c.marca = "Samsung";
        c.memoriaRam = "8GB";
        c.processador = "Intel Core i5";
        c.discoRigido = "NVMe";

        n.bateria ="Até 10 horas";
        n.velocidadeWifi = "40 MB";
        n.versaoBluetooth ="Bluetooth 5.1";

        d.tamanhoGabinete = "Torre completa";
        d.monitorExterno = "Monitor Led 29'' Ultrawide";
        d.fonte = "	40W";

    }
}
