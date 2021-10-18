public class Notebook extends Computador{
   public String bateria;
   public String velocidadeWifi;
   public String versaoBluetooth; 

   @Override
   public String toString() {
       return "Bateria: "+bateria+"\nVelocidade Wifi:"+velocidadeWifi+ "\nVersão Bluetooth: "+versaoBluetooth+"\n";
   }
}
